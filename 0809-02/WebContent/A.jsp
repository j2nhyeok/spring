

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>현재시간</title>
</head>
<body>
	<h1>A</h1>
<% Object result = request.getAttribute("result"); %>
<p> <%= result %></p>
</body>
</html>