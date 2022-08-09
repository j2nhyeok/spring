<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적 정보랄까</title>
</head>
<body>
	<!-- 
    	입력폼. (밑에 두 개는 필수 입력임 )
    	사용자 이름
    	사용자 나이
     -->

	<form action="./personresult.jsp">
		<input type="text" name="name" placeholder="이름을 입력하세요." required /> 
		<input type="number" name="age" placeholder="나이를 입력하세요." required />
		<input type="submit" />
	</form>

</body>
</html>