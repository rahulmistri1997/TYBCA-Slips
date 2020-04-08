import java.io.*;

import java.sql.*;

       public class slip25_2
     {
         public static void main(String args[])
       {
            try
            {
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               Connection con=null;
              //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con = DriverManager.getConnection("jdbc:odbc:lab.dsn");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");

                Statement sta=con.createStatement();


            sta=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet rs=sta.executeQuery("select * from employee");
               
                for(;;)
               {
                    System.out.println("---------MAIN MENU---------");
                      System.out.println("1:Next");
                      System.out.println("2:First");
                      System.out.println("3:Previous");
                       System.out.println("4:Last");
                      System.out.println("5:Exit");
                       System.out.println("ENTER your choice :");
                       int choice=Integer.parseInt(br.readLine());
               
               switch(choice)
                {
                      case 1:
                                  System.out.println("Display next record");
                                  rs.next();
                                   System.out.println(" eNo:"+rs.getInt(1));
                                  System.out.println("eName:"+rs.getString(2));
                                  System.out.println("sal:"+rs.getFloat(3));
                             break;
                       case 2:
                                  System.out.println("Display first record");
                                  rs.first();
                                   System.out.println("eNo:"+rs.getInt(1));
                                  System.out.println("eName:"+rs.getString(2));
                                  System.out.println("sal:"+rs.getFloat(3));
                             break;
                       case 3:
                                  System.out.println("Display previous record");
                                  rs.previous();
                                   System.out.println("eNo:"+rs.getInt(1));
                                  System.out.println("eName:"+rs.getString(2));
                                  System.out.println("sal:"+rs.getFloat(3));
                             break;
                          case 4:
                                  System.out.println("Display last record");
                                  rs.last();
                                   System.out.println("eNo:"+rs.getInt(1));
                                  System.out.println("eName:"+rs.getString(2));
                                  System.out.println("sal:"+rs.getFloat(3));
                             break;
                           case 5:
                                           System.exit(0);
                                     break;
                     }
                      }
                  }
                     catch(Exception e)
                      {
                          System.out.println(e);
                       }
              }
             }