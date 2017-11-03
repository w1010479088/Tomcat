package testServetForHttp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TomcatServlet extends HttpServlet {
	private static final long serialVersionUID = 4601029764222607869L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("测试正常,可以访问Tomcat服务器!,是不是找揍?这么频繁的访问我?");
		out.flush();
		out.close();
	}
}
