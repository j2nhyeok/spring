



<%@ page import="java.time.LocalDate" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  // scriptlet. 자바처럼 사용할 수 있다. 
	
		System.out.println("사용자가 jsp 페이지를 요청했습니다. ");

	%>
	<p> 오늘 날짜는 다음과 같습니다 </p>
	<strong><%= LocalDate.now() %></strong><br />

	
</body>
</html>