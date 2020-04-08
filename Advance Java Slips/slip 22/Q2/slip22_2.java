import java.sql.*;
import java.io.*;
import javax.sql.*;

class slip22_2
{
    public static void main(String args[])
    {
        Connection con;
        Statement state;
        ResultSet rs;
        int ch;
       
    boolean flag=true;
    String decision;
    int no;
       
        
        try
        {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            con = DriverManager.getConnection("jdbc:odbc:lab.dsn");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");

            System.out.println("Statement object created");

            do
            {
                System.out.println("\n");
                System.out.println("Menu:");
                System.out.println("1.create Table");
                System.out.println("2.Insert Record into the Table");
               System.out.println("3.Display all the Records from the Table");
                System.out.println("4.Exit");
                System.out.println("Enter your choice: ");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());

                switch(ch)
                {
                 case 1:
                    state=con.createStatement();
                    String query="create table student"+"(rno int ,"+" sname varchar(20),"+" per int,"+" address varchar(20))";
                    state.executeUpdate(query);
                    System.out.println("Table created");


                    case 2:
                    System.out.println("Enter student Number: ");
                     int rno=Integer.parseInt(br.readLine());
                    
                   System.out.println("Enter student Name: ");
                    String sname=br.readLine();
                    
                    System.out.println("Enter per: ");
                    int per=Integer.parseInt(br.readLine());

                    System.out.println("Enter address: ");
                    String address=br.readLine();

                    String sql="insert into student values(?,?,?,?)";
                    PreparedStatement p=con.prepareStatement(sql);
                    p.setInt(1,rno);
                    p.setString(2,sname);
                    p.setInt(3,per);
                    p.setString(4,address);

                    p.executeUpdate();
                    System.out.println("Record Added");
                    
                    break;
                

                    case 3:
                    state=con.createStatement();
                    sql="select * from student";
                    rs=state.executeQuery(sql);
                    while(rs.next())
                    {
                        System.out.println("\n");
                        System.out.print("\t" +rs.getInt(1));
                        System.out.print("\t" +rs.getString(2));
                        System.out.print("\t" +rs.getInt(3));
                        System.out.print("\t" +rs.getString(4));
                    }
                    break;

                    case 4:
                    System.exit(0);

                    default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }while(ch!=4);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}