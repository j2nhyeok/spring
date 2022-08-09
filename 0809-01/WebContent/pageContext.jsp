<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> context가 뭔가요??? </p> <!--  개발자들이 사용하는 정보들이 모여있는 공간이랄까여 -->
	<%
		ServletRequest req = pageContext.getRequest();
	out.println(req == request);
	out.println("<br />");
	ServletResponse resp = pageContext.getResponse();
	out.println(resp == response);
	%>
</body>
</html>