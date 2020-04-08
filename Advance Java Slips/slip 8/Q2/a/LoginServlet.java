import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet{
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:tybca/bca@localhost:1521:XE");

			ps = con.prepareStatement("select * from users where user_id=? and user_pwd=?");

			String uid = req.getParameter("uid");
			String pass = req.getParameter("pass");

			ps.setString(1,uid);
			ps.setString(2,pass);

			rs = ps.executeQuery();			

			res.setContentType("text/html");

			PrintWriter out = res.getWriter();

			if(rs.next())
				res.sendRedirect("http://localhost:8090/bca/success.html");
			else
				res.sendRedirect("http://localhost:8090/bca/fail.html");
		}
		catch(Exception e){}
	}
}


