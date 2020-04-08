import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewHobbyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		Cookie c[] = req.getCookies();

		if(c!=null)
		{
			out.print("<table border=1>"+
			"<tr><th>Name</th><th>Value</th></tr>");
			
			for(int i=0;i<c.length;i++){
				out.print("<tr><td>"+c[i].getName()+"</td><td>"+
					c[i].getValue()+"</td></tr>");
			}

			out.print("</table>");
		}			
	}
}