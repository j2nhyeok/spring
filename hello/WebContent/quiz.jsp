<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>다음 문제의 답을 입력하세요. </p>
	
	<p> 안되면? OOOO </p>
	
	<form action="/hello/open.jsp" method = "get">  
	<label>정답 입력 :<input id="answer" type = "text" name = "answer" placeholder="정답을 입력하세요."  required>  </label>
	<input type="submit">
	
	</form>
</body>
</html>