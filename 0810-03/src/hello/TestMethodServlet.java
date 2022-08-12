package hello;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotation으로 서블릿 등록하기  - web.xml에 같이 서블릿 등록하면 중복되어 에러가 남.
@WebServlet(name = "testMethodServlet", urlPatterns = "/testMethod", 
initParams = @WebInitParam(name = "name1", value = "value1")
, loadOnStartup = 1) //loadOnStartup 은 서버 구동할때 init
public class TestMethodServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException { // config는 생성될 때 필요한 설정이 들어가있는 객체.
		System.out.println("해당 서블릿을 생성할 때 호출됩니다.");
		System.out.println("Servletconfig 객체는 설정한 init param접근 가능합니다.");
		System.out.println(config.getInitParameter("name1"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doGet(req,resp); // post방식으로 들억오면 doGet 메서드를 호출한다.
		resp.setStatus(405);
	}

}
