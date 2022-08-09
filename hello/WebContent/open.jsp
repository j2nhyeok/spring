<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정답공개.</title>
</head>
<body>
   제출한 정답 = <%= request.getParameter("answer") %> <br> 
  정답 = 어떡하지 
  <%
  
  String temp = "";
  
  if(request.getParameter("answer").equals("어떡하지")){
	  temp = "정답입니다.";
  } else{
	  temp = "오답입니다.";
  }
  
  
  
  %>
  
  	<br>
  
  <%=
  	temp
  %>
</body>
</html>