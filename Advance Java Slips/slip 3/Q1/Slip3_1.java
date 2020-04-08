import java.sql.*;
import java.lang.*;
import java.io.File;

public class Slip3_1
{
    public static void main(String a[]) 
    {
        Connection con;
        try
        {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
            if(con==null)
            {
                System.out.println("Connection Failed");
                System.exit(1);
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * From employee Where department='computer science'");
            System.out.println("eno\t"+"ename\t"+"department\t\t"+"sal");
            while(rs.next())
            {
                System.out.println("\n"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
            }
            con.close();
            rs.close();
            stmt.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}