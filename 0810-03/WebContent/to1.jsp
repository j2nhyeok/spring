
<%
	String select = request.getParameter("select");
	
	if(select.equals("register")){
	response.sendRedirect("register.jsp");
	}else{
		response.sendRedirect("./show");
	}
%>
