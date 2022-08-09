<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
	String selectContinent = request.getParameter("continent");

	Class.forName("com.mysql.cj.jdbc.Driver");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
List<String[]> list = new ArrayList<>();

try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	String sql = "SELECT Name, Population  FROM country WHERE continent = ? ORDER BY Population desc ";
	pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, selectContinent);
	rs = pstmt.executeQuery();
	
	while (rs.next()) {
		String name = rs.getString("Name");
		String population = rs.getString("Population");

		list.add(new String[] { name, population });
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

//request 객체에 list를 attribute로 설정하기
request.setAttribute("countries", list);
// 다음 페이지로 forward 시키기
request.getRequestDispatcher("viewcountry.jsp").forward(request, response);
%>