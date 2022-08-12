package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	public int registerPerson(String name, int age) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
			String sql = "INSERT INTO people VALUES (?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			
			count  = pstmt.executeUpdate();
		}finally {
	
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
		
		return count;
		
	}

	public List<Person> getAllList() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Person> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
			String sql = "SELECT *  FROM people ";
			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");

				list.add(new Person(name, age));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;

	}
}
