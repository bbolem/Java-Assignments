import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("Login servlet init() method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login servlet init() method");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		out.println("Login success... Welcome " + name);
		
	}
	

}
