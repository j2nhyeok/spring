<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>JSP Expression Language</p>
	${ "qwer" }
	${ 123 }
	${ 55.432 }
	${ true }
	<br>
	${ 1+ 2 }
	${ true && false }  <!--연산까지 가능함-->
	<br>
	${pageContext.request.requestURI }  <!--getrequest인데 get생략 가능함.-->
</body>
</html>