package Dispatcher_and_redirect;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/signup")
public class Sign_up extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		res.getWriter().print("<h1>Welcome to sign_up page");
		
	}
	

}
