package person;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("./register.jsp");
	} // doGet은 정의 하는게 좋다.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 한글 깨짐 현상을 고쳐보자.
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		PersonValidator validator = new PersonValidator();

		Map<String, String> errors = new HashMap<String, String>();
		errors.putAll(validator.isValidName(name));
		errors.putAll(validator.isValidAge(age));

		if (errors.size() > 0) {
			// . 그러면 잘 못된 값일 때 사용자에게 뭐라고 해야할지...??
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		} else {

			PersonDAO dao = new PersonDAO();

			try {

				System.out.println(dao.registerPerson(name, age));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

			// 등록하면 목록 페이지로 보낼거임 ㅋㅋ.ㅋ.
			resp.sendRedirect("./show");
		}
	}

}
