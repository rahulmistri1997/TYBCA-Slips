import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddHobbyServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		Cookie c[] = req.getCookies();

		String hobby = req.getParameter("hobby");

		if(c==null){
			Cookie newCookie = new Cookie("ID1",hobby);
			res.addCookie(newCookie);
		}
		else{
			int i;
			for(i=0; i<c.length;i++)
			{
				if(c[i].getValue().equals(hobby))
					break;
			}
	
			if(i==c.length){
				Cookie newCookie = new Cookie("ID"+(i+1),hobby);
				res.addCookie(newCookie);
			}
		}

		res.sendRedirect("http://localhost:8080/slip21q2/hobby.html");
	}							
}