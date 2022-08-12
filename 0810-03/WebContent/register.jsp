<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./register.do" method="post">
		<label>이름 : <input type="text" name="name" /></label> 
		<label>나이 : <input	type="number" name="age" /></label>
		<input type="submit" >
		
		
		<c:if test="${ not empty errors }">
			<div>
				<c:forEach var="message" items="${ errors }">
					<p> ${ message.value }</p>				
				</c:forEach>
			</div>
		</c:if>
	</form>
</body>
</html>