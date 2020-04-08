import java.io.*;
import java.sql.*;
class Deleteemp
{
  static Connection cn;
  static Statement st;
  static ResultSet rs;
  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String args[])
           
  {
        int e,k,ch,sal;
            String en;
        try
            {
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                cn=DriverManager.getConnection("jdbc:odbc:Emp","","");
            st=cn.createStatement();
           
                                    do
                                    {
                                   
                                                System.out.println("1. Delete ");
                                                System.out.println("2. Exit ");
                                                System.out.println("Enter Ur Choice");
                                                ch=Integer.parseInt(br.readLine());
                                                switch(ch)
                                                {
                                   
                                               
                                                case 1:
                                                                        System.out.println("Enter the Eno");
                                                                        e=Integer.parseInt(br.readLine());
                                                                        String sd="delete from emp where eno=" +e;
                                                                        k=st.executeUpdate(sd);
                                                                        if(k>0)
                                                                        {
                                                                                    System.out.println("Record Is Deleted");
                                                                        }
                                                                        break;
                                                case 2:
                                                                        System.exit(0);
                                                }
                                                }
                                                while(ch!=2);
                                                }
                                                catch(Exception et)
                                                 {
                                                            System.out.println(et);
                                                 }
                                        }
}