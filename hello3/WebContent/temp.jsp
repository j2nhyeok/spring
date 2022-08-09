
	<%
	String sentence = request.getParameter("check");
	if(sentence.equals("person")){
	
	
	response.sendRedirect("./persons.jsp");
	
	
	}
	else{
		

	response.sendRedirect("./fruit.jsp");

	}
	%>
