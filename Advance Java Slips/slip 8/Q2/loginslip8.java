//slip 8 Q2. Write a servlet application to accept username and password, search them into database, if found then display appropriate message on the browser otherwise display error message.

import java.io.*;
import java.lang.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class loginslip8 extends HttpServlet
{

  public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
{
  response.setContentType("text/html");

  PrintWriter pw = response.getWriter();


  Connection conn;
  try
{
  String uname = request.getParameter("uname");
  String pass = request.getParameter("pass");
  //pw.println( modelno);
  //pw.println(mobilename);


//   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 //conn = DriverManager.getConnection("jdbc:odbc:mydsn.dsn");
 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
conn=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");

  //PreparedStatement pst = conn.prepareStatement  ("insert into mobile values(?,?)");
  String query = "select * from login where username='"+uname+"' and password='"+pass+"'";
  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery(query);

  if(rs.next())
  {
            pw.println("<br>Welcome ..."+uname);
  } else {
              pw.println("<br>Sorry, Please enter correct credentials");
  }

  }
  catch (Exception e){
  pw.println(e);
  }
  }
