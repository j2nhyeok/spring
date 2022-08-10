package hello;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	// Servlet은 상태를 가지는 값을 사용하면 사용하기 힘들어짐.
	private int some = 10;
	public HelloServlet() {
		super();
		System.out.println("헬로 서블릿 생성자는 언제 호출 되나요?");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		some++;
		System.out.println("필드값 : " + some);
		
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
	}
}
