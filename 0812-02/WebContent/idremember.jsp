
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("rememberme")) {
				request.setAttribute("idvalue", URLDecoder.decode(c.getValue(), "utf-8"));
				request.getRequestDispatcher("ok.jsp").forward(request, response);
				
			}
		}
	%>
	<form action="./login" method="post">

		<input type="text" name="id" value="" /> 
		<input type="password" name="password" /> <input type="checkbox" name="rememberme" /> 
		<input type="submit" />

	</form>
</body>
</html>