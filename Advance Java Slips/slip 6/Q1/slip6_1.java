//SLIP 6:  Write a java program to accept the details of customer (CID, CName, Address, Ph_No) and store it into the database(Use PreparedStatement interface)

import java.sql.*;
import java.io.*;


class slip6_1
{
            public static void main(String a[])
            {
                        PreparedStatement ps;
                        Connection con;
                        try{
                          Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        									con=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                                    if(con==null)
                                    {
                                                System.out.println("Connection Failed......");
                                                System.exit(1);
                                    }
                                    System.out.println("Connection Esatablished......");
                                    Statement stmt=con.createStatement();


                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    String query="INSERT INTO Customer VALUES(?,?,?,?)";
                                    ps=con.prepareStatement(query);

                                    System.out.println("Customer Details....");
                                    System.out.println("Enter CID");
                                    int cid=Integer.parseInt(br.readLine());
                                    ps.setInt(1,cid);
                                    System.out.println("Enter name");
                                    String name=br.readLine();
                                    ps.setString(2,name);
                                    System.out.println("Enter Address");
                                    String add=br.readLine();
                                    ps.setString(3,add);
                                    System.out.println("Enter Ph_No");
                                    String phno=br.readLine();
                                    ps.setString(4,phno);

                                    int no=ps.executeUpdate();
                                    if(no!=0)
                                                System.out.println("Data inserted succesfully.....");
                                    else
                                                System.out.println("Data NOT inserted");
                                    con.close();


                        }
                        catch(Exception e)
                        {
                                    e.printStackTrace();
                        }
            }
}
