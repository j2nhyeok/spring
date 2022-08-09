<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 페이지</title>
</head>
<body>
	<p> 로그인 처리 요청이  전달 되었나요?</p>
	
	<%
		String id = request.getParameter("userid");
		// 해당 파라미터 값이 전달이 되었으나 , 입력값이 없으면
		// "" 빈문자열
		
		// 파라미터 이름이 없으면 null
		
		
	
		// 입력값이 있으면 xx님 반갑다.
		if(id.length()>0){
			out.println(id + "님 ㅎㅇㅎㅇ");
		} else{
			out.println("아이디 입력하세요.");
			response.sendRedirect("./login.jsp");// 사용자에게 페이지를 이동하라고 명령하는 sendRedirect
		}
	%>
	
</body>
</html>