//SLIP15:  Write a JDBC program in java to update an address of given customer(cid,cname,address) and display updated details.

import java.sql.*;
import java.io.*;
class Slip15_1
{
            public static void main(String args[])
            {
                        Connection con;
                        Statement stmt;
                        PreparedStatement ps;
                        String cname;
                        try
                        {
                                    //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
									Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                                    //con=DriverManager.getConnection("jdbc:odbc:dsn");
									con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                                    if(con==null)
                                    {
                                                System.out.println("Connection Failed....");
                                                System.exit(1);
                                    }

                                    System.out.println("Connection Established...");

                                    stmt=con.createStatement();

                                    String query="Update Customer set address=? where cname=?";
                                    ps=con.prepareStatement(query);

                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    System.out.println("Enter Customer name for Update:");
                                    cname=br.readLine();

                                    System.out.println("Enter new Address:");
                                    String addr=br.readLine();
                                    ps.setString(1,addr);
                                    ps.setString(2,cname);
                                    int no=ps.executeUpdate();

                                    if(no==0)
                                    {
                                                System.out.println("Not updated in table....");
                                                System.out.println("Name Not match"+cname);
                                    }          
                                    else
                                    {
                                                System.out.println("Succesfully updated in table....");

                                                ps=con.prepareStatement("select * from Customer where cname=?");
                                                ps.setString(1,cname);
                                                ResultSet rs=ps.executeQuery();
                                                System.out.println("cid\t"+"Name\t"+"address\t"+"ph_no");
                                                while(rs.next())
                                                {
                                                           System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)); 
                                                }
                                    }
                                    con.close();

                        }
                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
            }
        }