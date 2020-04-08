import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InactiveIntervalServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);

		out.print("The previous timeout was "+session.getMaxInactiveInterval()+"<br>");

		session.setMaxInactiveInterval(2*60*60);

		out.print("The newly assigned timeout is "+session.getMaxInactiveInterval()+"<br>");
	}
}