
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

	<label>아이디 :<input type="text" name="id" value="" /></label> 
		<label>비밀번호 :	<input type="password" name="password" /></label>
	<label>아이디 저장하기	<input type="checkbox" name="rememberme" /></label> 
		<input type="submit" />

	</form>
</body>
</html>