<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${ requestScope.name1 }</p>
	<p>${ requestScope.name2 }</p>
	<p>${ applicationScope.name3 }</p>
	<p>${ requestScope.name4 }</p>
	<p>${ applicationScope.name4 }</p>
	
	
	<hr>
	<p>${ name1 }</p>
	<p>${ name2 }</p>
	<p>${ name3 }</p>
	<p>${ name4 }</p>  <!-- 좁은 영역을 가진 거 부터 찾아본다 -> 우선 순위 request>application -->
	<hr>
	<p>${ none }</p> <!-- 없는 값 달라하면 null도 아니고 그냥 공백을 출력한다. -->
	
</body>
</html>