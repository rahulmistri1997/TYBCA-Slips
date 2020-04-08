import java.sql.*;
import java.io.*;
import javax.sql.*;

class slip29_2
{
    public static void main(String args[])
    {
        Connection con;
        Statement state;
        ResultSet rs;
        int ch,k;
      
    boolean flag=true;
    String decision;
    int rno;
      
       
        try
        {
//           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//           con = DriverManager.getConnection("jdbc:odbc:lab.dsn");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");			

            System.out.println("Statement object created");

            do
            {
                System.out.println("\n");
                System.out.println("Menu:");
                System.out.println("1.Insert Record into the Table");
                System.out.println("2.Update The Existing Record.");
                System.out.println("3.Display all the Records from the Table");
                System.out.println("4.Delete Record into the Table");
                System.out.println("5.Search The Existing Record.");
                System.out.println("6.Exit");
                System.out.println("Enter your choice: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());

                switch(ch)
                {
                    case 1:
                    System.out.println("Enter Student Number: ");
                    rno=Integer.parseInt(br.readLine());
                   
                    System.out.println("Enter Student Name: ");
                    String name=br.readLine();
                   
                    System.out.println("Enter Percentage: ");
                    int per=Integer.parseInt(br.readLine());
                    String sql="insert into Student values(?,?,?)";
                    PreparedStatement p=con.prepareStatement(sql);
                    p.setInt(1,rno);
                    p.setString(2,name);
                    p.setInt(3,per);
                    p.executeUpdate();
                    System.out.println("Record Added");
                   
                    break;

                   
                    case 2:
                       

            state=con.createStatement();
            System.out.println("Enter the rno");
            rno=Integer.parseInt(br.readLine());
                       
            System.out.println("Enter the per"); 
             per=Integer.parseInt(br.readLine());
                       
            String ss="update Student set Student.per="+per+" where(((Student.[rno])="+rno+"))";
                      
             k=state.executeUpdate(ss);
            System.out.println(ss);

                        if(k>0)
                        {
                              System.out.println("Record Is Updated");
                        }
                        break;


                    case 3:
                    state=con.createStatement();
                    sql="select * from Student";
                    rs=state.executeQuery(sql);
                    while(rs.next())
                    {
                        System.out.println("\n");
                        System.out.print("\t" +rs.getInt(1));
                        System.out.print("\t" +rs.getString(2));
                        System.out.print("\t" +rs.getInt(3));
                    }
                    break;
                   
                    case 4:
               
                               
                state =con.createStatement();

                while(flag)
                {
                System.out.println("Enter Student Number for the record you wish to Delete: ");
                rno=Integer.parseInt(br.readLine());
               
                sql="delete from Student where rno="+rno;
                System.out.println(sql);
                   int rows=state.executeUpdate(sql);
                System.out.println(rows+"rows sucessfully Deleted");
                System.out.println("Do u want to Delete more data:y/n:");

                decision=br.readLine().toLowerCase();
                if(decision.charAt(0)=='n')
                flag=false;

               
                }
                break;
       
                     case 5:
                    state=con.createStatement();                   
                    System.out.println("enter roll no u want to search");
                    rno=Integer.parseInt(br.readLine());
                    sql="select * from Student where rno="+rno;
                    rs=state.executeQuery(sql);

                    System.out.println("success");
                    while(rs.next())
                    {
                    System.out.println("RollNo="+rs.getInt(1)+""+"name="+rs.getString(2)+" "+"per="+rs.getInt(3));
                    }
                    break;
                   

                    case 6:
                    System.exit(0);

                    default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }while(ch!=6);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}