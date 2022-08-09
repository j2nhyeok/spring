<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int number = Integer.parseInt(request.getParameter("num"));
		if(number == 1){
			
			%>
			<img src="./images/chunsik/춘식1.png" />
			<%
		}else if(number ==2){
			%>
			<img src="./images/chunsik/춘식1.png" />
			<img src="./images/chunsik/춘식2.png" />
			<%
		}else if(number == 3){
			%>
			<img src="./images/chunsik/춘식1.png" />
			<img src="./images/chunsik/춘식2.png" />
			<img src="./images/chunsik/춘식3.png" />
			<%
		}
	%>
</body>
</html>