<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/hello/requestinfo.jsp" method = "post">  
		<input id="inputName" type = "text" name = "name" placeholder="이름을 입력하세요."  required, maxlength = "10">
		 <input id="inputAge" type = "text" name = "age" placeholder="나이를 입력하세요."  required, maxlength = "3">
			<label> <input  type = "radio" name = "gender" value="male" checked />남성</label>
		<label><input  type = "radio" name = "gender" value="female" >여성</label>
		<label><input type="checkbox" name="hobby" value="java">java</label>
		<label><input type="checkbox" name="hobby" value="html">html</label>
		<label><input type="checkbox" name="hobby" value="css">css</label>
		<label><input type="checkbox" name="hobby" value="javascript">자스</label>
		 <input type = "submit">
	</form>
</body>
</html>