//SLIP 10:  Write a JDBC program to count the number of records in table.(Without using standard method)

import java.sql.*;

class slip10_1 {
    public static void main(String args[]) {
        Connection con;
        Statement stmt;
        try {
          //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          //con=DriverManager.getConnection("jdbc:odbc:dsn");
          Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          con=DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
            if (con == null) {
                System.out.println("Connection Failed.......");
                System.exit(1);
            }
            System.out.println("Connection Established......");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");

            int cnt = 0;
            while (rs.next()) {
                cnt++;
            }
            System.out.println("Number of records in Table are:" + cnt);
        }

        catch (Exception e) {
            System.out.println(e);

        }
    }
}
