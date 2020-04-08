import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class slip30_2 extends HttpServlet{
               private Connection con;
               private Statement s;
               private ResultSet rs;
 
               public void doGet(HttpServletRequest req, HttpServletResponse res)
               throws ServletException, IOException{
                               res.setContentType("text/html");
 
                               PrintWriter out = res.getWriter();
 
                               try{
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
               con = DriverManager.getConnection("jdbc:odbc:mydsn.dsn");
 
                                              s = con.createStatement();
 
                                              rs = s.executeQuery("select * from product");
 
 
                                              out.print("<table border=1 bgcolor='yellow'>"+
                                              "<tr bgcolor='red'>"+
                                              "<th>Code</th><th>Name</th><th>Price</th></tr>");
 
                                              while(rs.next()){
                                                             out.print("<tr>"+
                                                                            "<td>"+rs.getInt(1)+"</td>"+
                                                                            "<td>"+rs.getString(2)+"</td>"+
                                                                            "<td>"+rs.getFloat(3)+"</td>"+
                                                                            "</tr>");
                                              }                                                                                          
                                              out.print("</table>");
                               }
                               catch(Exception e){
                                              out.print(e);
                               }
               }