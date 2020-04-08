//slip 14 Q2. Write a JDBCprogram in java to display details of Book_Sales(SalesID, Date, Amount) of selected month in JTable. Book_sales tableis already created. (Use JCombocomponent for Month selection)

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

class MonthSales extends JFrame{
            private JTable tabSales;
            private DefaultTableModel dtm;
            private JLabel lblMonth;
            private JComboBox cmbMonth;
            private JPanel panNorth;

            private Connection con;
            private PreparedStatement ps;
            private ResultSet rs;

            public MonthSales(){
                        lblMonth = new JLabel("Month:");
                       
 String months[] = {"---","JAN","FEB","MAR","APR","MAY",
                                        "JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

                        cmbMonth = new JComboBox(months);

                        panNorth = new JPanel();
                        panNorth.add(lblMonth);
                        panNorth.add(cmbMonth);

                        dtm = new DefaultTableModel();
                        tabSales = new JTable(dtm);

                        dtm.addColumn("SalesID");
                        dtm.addColumn("SalesDate");
                        dtm.addColumn("Amount");

                        setTitle("Sales Report");
                        setSize(400,300);
                        setLocation(100,100);
                        add(panNorth,"North");
                        add(new JScrollPane(tabSales),"Center");
                        setVisible(true);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        try{
                            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                            con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                                   
                        }
                        catch(Exception e){
                                    JOptionPane.showMessageDialog(null,e);
                                    dispose();
                        }

                        cmbMonth.addItemListener(new ItemListener(){
                                    public void itemStateChanged(ItemEvent ie){
                                                try{
                                                            String month = cmbMonth.getSelectedItem().toString();

                                                            ps = con.prepareStatement("select * from Book_Sales where SalesDate like '%"+month+"%'");


                                                            rs = ps.executeQuery();

                                                            int n = dtm.getRowCount();
                                                            for(int i=0;i<n;i++)
                                                                        dtm.removeRow(0);

                                                            while(rs.next()){

                                                                        Vector row = new Vector();
                                                                        row.add(rs.getInt(1));
                                                                        row.add(rs.getString(2));
                                                                        row.add(rs.getFloat(3));
                                                                       
                                                                        dtm.addRow(row);
                                                            }
                                                }
                                                catch(Exception e){
                                                            JOptionPane.showMessageDialog(null,e);
                                                }
                                    }
                        });
            }

            public static void main(String args[]){
                        new MonthSales();
            }
}