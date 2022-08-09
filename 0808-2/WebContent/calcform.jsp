<!--  
	입력 폼
	숫자 1
	숫자2
	
	연산자 + - * / 선택
	
	전송
	

 -->




<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./calcresult.jsp">
		<input type="number" name="firstNumber" placeholder="첫 번째 숫자를 입력하세요."  required/> 
		<input type="number" name="secondNumber" placeholder="두 번째 숫자를 입력하세요."  required /> 
		<input type="text" name="operator" placeholder="연산자를 입력하세요."  required/> 
		<input type="submit" />
	</form>
</body>
</html>