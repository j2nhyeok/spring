package person;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO dao = new PersonDAO();
		List<Person> list = null;
		try {
			list = dao.getAllList();
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("people", list);
		req.getRequestDispatcher("viewpeople.jsp").forward(req, resp);

	}
}
