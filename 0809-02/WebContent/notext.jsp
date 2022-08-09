<%
	int result = 1 + 1;

request.setAttribute
("result", result); // 키와 값.. application이 동작하는 동안 사라지지 않음.
request.getRequestDispatcher("/WEB-INF/viewPage.jsp")
	.forward(request, response);


%>