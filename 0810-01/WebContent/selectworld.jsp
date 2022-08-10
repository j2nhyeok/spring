
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.Country"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<% 

	String continent = request.getParameter("continent");
	CountryDAO dao = new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent);

	
	//request 객체에 list를 attribute로 설정하기
	request.setAttribute("countries", list);
	// 다음 페이지로 forward 시키기
	request.getRequestDispatcher("viewcountry.jsp").forward(request, response);
%>

