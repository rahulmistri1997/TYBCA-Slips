//SLIP11:  Write a JDBC program to remove "percentage" column from student (rno, sname, percentage) table. Student table is already created.

import java.sql.*;

class Slip11 {
    public static void main(String a[]) {
        Connection con;
        Statement stmt;
        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            con = DriverManager.getConnection("jdbc:odbc:dsn");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
            if (con == null) {
                System.out.println("Connection Failed.......");
                System.exit(1);
            }
            System.out.println("Connection Established......");
            stmt = con.createStatement();
            int no = stmt.executeUpdate("alter table student drop column per");
            if (no != 0)
                System.out.println("Drop col sucessfully");
            else
                System.out.println("NOT Drop col ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
