import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int a=Integer.parseInt(request.getParameter("t1"));
		int b=Integer.parseInt(request.getParameter("t2"));
		
		int c=a+b;
		
		PrintWriter out=response.getWriter();
		out.println("<h1> ADDITION = "+c+"</h1>");
		
		out.close();
	}
}