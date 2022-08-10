package person;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		PersonDAO dao = new PersonDAO();
		
		try {
		
			System.out.println(	dao.registerPerson(name, age));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}
}
