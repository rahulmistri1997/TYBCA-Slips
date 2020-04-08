import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;
import java.text.*;

class SalesReport extends JFrame{
            private JLabel lblStart,lblEnd;
            private JComboBox cmbStart,cmbEnd;
            private JPanel panNorth;
            private JButton btnShow;
            private JTable tabReport;
            private DefaultTableModel dtm;

            public SalesReport(){
                        lblStart = new JLabel("Start Date:");
                        lblEnd = new JLabel("End Date:");

                        cmbStart = new JComboBox();
                        cmbEnd = new JComboBox();

                        Calendar calendar = new GregorianCalendar();
                        java.util.Date d = new java.util.Date();
                        System.out.println(d.getDate());
                        calendar.set(Calendar.YEAR, d.getYear()+1900);
                        calendar.set(Calendar.MONTH, d.getMonth());
                        calendar.set(Calendar.DAY_OF_MONTH, d.getDate());

                        for(int i=1000;i>=1;i--){
                                    String str = calendar.get(Calendar.YEAR)+"-"+
                                                (calendar.get(Calendar.MONTH)+1)+"-"+
                                                calendar.get(Calendar.DAY_OF_MONTH);
                                    cmbStart.addItem(str);
                                    cmbEnd.addItem(str);
                                    calendar.add(Calendar.DAY_OF_MONTH, -1);
                        }

                        btnShow = new JButton("Show");

                        panNorth = new JPanel(new GridLayout(1,4));
                        panNorth.add(lblStart);
                        panNorth.add(cmbStart);
                        panNorth.add(lblEnd);
                        panNorth.add(cmbEnd);
                        panNorth.add(btnShow);

                        dtm = new DefaultTableModel();
                        dtm.addColumn("PID");
                        dtm.addColumn("PName");
                        dtm.addColumn("Amount");
                        dtm.addColumn("Date");
                       
                        tabReport = new JTable(dtm);

                        setTitle("Sales Report");
                        setSize(400,400);
                        add(panNorth,"North");
                        add(new JScrollPane(tabReport),"Center");
                        setVisible(true);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        btnShow.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent ae){
                                                try{
                                                            for(int i=0;i<dtm.getRowCount();i++)
                                                                        dtm.removeRow(0);

//                                                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                    con=DriverManager.getConnection("jdbc:odbc:lab.dsn");
															Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
															con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");

                                                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
                                                            String sdate = cmbStart.getSelectedItem().toString();
                                                            String edate = cmbEnd.getSelectedItem().toString();

                                                            java.util.Date d = sdf.parse(sdate);
                                                            java.sql.Date newsdate = new java.sql.Date(d.getTime());

                                                            d = sdf.parse(edate);
                                                            java.sql.Date newedate = new java.sql.Date(d.getTime());
                                               
                                                            PreparedStatement ps = con.prepareStatement("select * from prod_sales where sale_date between ? and ?");
                                                            ps.setDate(1,newsdate);
                                                            ps.setDate(2,newedate);
                       
                                                            ResultSet rs = ps.executeQuery();
                                                            while(rs.next()){
                                                                        Vector v = new Vector();
                                                                        v.add(rs.getString(1));
                                                                        v.add(rs.getString(2));
                                                                        v.add(rs.getString(3));
                                                                        v.add(rs.getString(4));
                                                                        dtm.addRow(v);
                                                            }
                                                }
                                                catch(Exception e){
                                                            JOptionPane.showMessageDialog(null,e);
                                                }
                                    }
                        });                   
            }

            public static void main(String args[]){
                        new SalesReport();
            }
}