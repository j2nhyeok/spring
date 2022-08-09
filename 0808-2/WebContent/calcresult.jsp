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
	String temp = request.getParameter("operator");
	int number1 = Integer.parseInt(request.getParameter("firstNumber"));
	int number2 = Integer.parseInt(request.getParameter("secondNumber"));
	
	if(temp.equals("+")) out.println(number1 + number2);
	else if(temp.equals("-")) out.println(number1 - number2);
	else if(temp.equals("*")) out.println(number1 * number2);
	else if(temp.equals("/")) out.println(number1 / number2);
	
	%>
	
</body>
</html>