//SLIP 9:  Write a JDBC program to delete the records of employees whose names are starts with ‘A’ character.

import java.sql.*;
import java.lang.*;
class Slip9_1
{
            public static void main(String args[])
            {
                        Connection con;
                        Statement stmt;
                        try
                        {
//                                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                                    con=DriverManager.getConnection("jdbc:odbc:dsn");
                                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                  									con=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                                    if(con==null)
                                    {
                                                System.out.println("Connection Failed....");
                                                System.exit(1);
                                    }
                                    System.out.println("Connection Established...");

                                    stmt=con.createStatement();

                                    int no = stmt.executeUpdate("Delete from employee where ename like 'A%'");
                                    if(no!=0)
                                                System.out.println("Delete Data sucessfully.....");
                                    else
                                                System.out.println("Data NOT Deleted");

                                    con.close();
                        }

                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
            }
}
