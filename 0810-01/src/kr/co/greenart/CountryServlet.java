package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 주소에  요청 흐름 제어

		String continent = req.getParameter("continent");
		CountryDAO dao = new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent(continent);
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		//request 객체에 list를 attribute로 설정하기
		req.setAttribute("countries", list);
		// 다음 페이지로 forward 시키기
		req.getRequestDispatcher("viewcountry.jsp").forward(req, resp);
	}
														
}
