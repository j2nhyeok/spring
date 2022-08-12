<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<c:if test="${ not empty people }">
		<ul>
			<c:forEach var="Person" items="${ people }">
				<li> ${ Person.name } ${ Person.age }</li>
				</c:forEach>
			
		</ul>
		</c:if>
</body>
</html>