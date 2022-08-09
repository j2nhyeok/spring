<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
	List<String> list = new ArrayList<>();
for (int i = 0; i < 100; i++) {
	list.add("book" + i);
}
%>



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
		int pageNumber = Integer.parseInt(request.getParameter("page"));
	
	
		int number = pageNumber * 10;
		
		for(int i = number - 10; i < number ; i++){
			out.println(list.get(i));
			
		}
	%>
</body>
</html>