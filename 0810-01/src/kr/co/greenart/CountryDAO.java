package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
	
	
	public List<Country> getCountryByContinent(String Continent) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Country> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			String sql = "SELECT Name, Population  FROM country WHERE continent = ? ORDER BY Population desc ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, Continent);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("Name");
				int population = rs.getInt("Population");

				list.add(new Country(name, population));
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
}
