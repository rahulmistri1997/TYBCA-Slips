import java.io.*;
import java.sql.*;
import java.lang.*;

public class slip13 {
    static Connection cn;
    static Statement st;

    public static void main(String args[]) {
        try {
            int mno, price;
            String company, color;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            cn = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
            st = cn.createStatement();
            String str = "create table Mobile(Model_No number,Company varchar(20),Price number,Color varchar(20))";
            st.executeUpdate(str);
            System.out.println("Table Created");
            System.out.println("Enter Model no");
            mno = Integer.parseInt(br.readLine());
            System.out.println("Enter Company");
            company = br.readLine();
            System.out.println("Enter Price");
            price = Integer.parseInt(br.readLine());
            System.out.println("Enter Color");
            color = br.readLine();
            st.executeUpdate("insert into Mobile values(" + mno + ",'" + company + "'," + price + ",'" + color + "')");
            System.out.println("Record added successfully");
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}