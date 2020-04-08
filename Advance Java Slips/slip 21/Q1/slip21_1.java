//SLIP21:  Write a JDBC Program in java to display the names of Employees starting with ‘S’ character

 
import java.sql.*;
class slip21_1
{
            public static void main(String args[])
            {           Connection con;
                        try
                        {
//                                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                                    con=DriverManager.getConnection("jdbc:odbc:dsn");
									Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
									con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                                    if(con==null)
                                    {
                                                System.out.println("Connection Failed....");
                                                System.exit(1);
                                    }
                                    System.out.println("Connection Established...");

                                    Statement stmt=con.createStatement();
                                    ResultSet rs=stmt.executeQuery("select * from employee where ename like 'S%'");
                                    System.out.println("eno\t"+"ename\t"+"department\t"+"sal");
                                    while(rs.next())
                                    {
                                               System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));       
                                    }
                        }
                        catch(Exception e)
                        {
                                    System.out.println(e);

                        }
            }
}