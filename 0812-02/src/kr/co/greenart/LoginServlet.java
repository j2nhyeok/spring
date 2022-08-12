package kr.co.greenart;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/idremember.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String rememberme = request.getParameter("rememberme");
		
		if(password.equals("1234")) {
			//로그인 성공
			// 쿠키(아이디)를 담은 성공 메세지 응답
			if(rememberme != null && rememberme.contentEquals("on")) {
			
			Cookie[] cookies = request.getCookies();
			Cookie cookie = null;
			
			for(Cookie c : cookies) {
				if(c.getName().equals("rememberme")) {
					cookie = c;
				}
			}
			
			if(cookie == null) {
				 cookie = new Cookie("rememberme", URLEncoder.encode(id, "utf-8"));
			}
			cookie.setMaxAge(60 *60 * 24);
			
			// 쿠키를 클라이언트로 전송
			response.addCookie(cookie); 
			
			
			}
			request.getRequestDispatcher("ok.jsp").forward(request, response);
			
		} else {
			//로그인 실패
		}
		
	}

}
