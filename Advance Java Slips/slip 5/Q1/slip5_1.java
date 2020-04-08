//SLIP 5 :  Write a java program to create Teacher table(TNo.TName, Sal, Desg) and insert a record in it.

import java.sql.*;
class Slip5_1
{
            public static void main(String args[])
            {           Connection con;
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

                                    Statement stmt=con.createStatement();

                                    //create a table teacher          
                                    String query="create table Teacher"+"(TNo int ,"+" TName varchar(20),"+" sal int,"+" desg varchar(20))";
                                    stmt.executeUpdate(query);
                                    System.out.println("given table created in database");

                                    //insert record into teacher table
                                    stmt.executeUpdate("insert into Teacher "+"values(1,'NRC',50000,'MCS')");
                                    stmt.executeUpdate("insert into Teacher "+"values(2,'ABC',10000,'MCA')");
                                    stmt.executeUpdate("insert into Teacher "+"values(3,'XYZ',40000,'MCA')");
                                    stmt.executeUpdate("insert into Teacher "+"values(4,'PQR',20000,'MCS')");
                                    System.out.println("Succesfully inserted in table....");

                                    //display details
                                    ResultSet rs=stmt.executeQuery("select * From Teacher");
                                    System.out.println("TNo\t"+"TName\t"+"sal\t"+"desg");
                                    while(rs.next())
                                    {
                                               System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                                    }

                        }          
                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
            }
}