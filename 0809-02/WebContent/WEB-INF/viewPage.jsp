<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자가 볼 페이지</title>
</head>
<body>
 	<p> 정보 </p>
 	<p> 연산의 결과 </p>


<%= request.getAttribute("result") %>
</body>
</html>

<!-- 사용자가 직접하지 못하게 WEB-INF에 넣어버린다  -->