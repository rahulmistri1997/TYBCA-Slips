import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class College extends JFrame{
            private JLabel lblID,lblName,lblAddr,lblYear;
            private JTextField txtID,txtName,txtAddr,txtYear;
            private JButton btnSave,btnClose;
            private JPanel panCenter,panSouth;

            private Connection con;
            private PreparedStatement ps;

            public College(){
                        lblID = new JLabel("College ID:");
                        lblName = new JLabel("College Name:");
                        lblAddr = new JLabel("Address:");
                        lblYear = new JLabel("Year:");

                        txtID = new JTextField();
                        txtName = new JTextField();
                        txtAddr = new JTextField();
                        txtYear = new JTextField();

                        panCenter = new JPanel();
                        panCenter.setLayout(new GridLayout(4,2));
                        panCenter.add(lblID);
                        panCenter.add(txtID);
                        panCenter.add(lblName);
                        panCenter.add(txtName);
                        panCenter.add(lblAddr);
                        panCenter.add(txtAddr);
                        panCenter.add(lblYear);
                        panCenter.add(txtYear);

                        btnSave = new JButton("Save");
                        btnClose = new JButton("Close");

                        panSouth = new JPanel();
                        panSouth.add(btnSave);
                        panSouth.add(btnClose);

                        setTitle("College Information");
                        setSize(400,200);
                        setLocation(100,100);
                        add(panCenter,"Center");
                        add(panSouth,"South");
                        setVisible(true);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        try{
              //                      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con=DriverManager.getConnection("jdbc:odbc:lab.dsn");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");
                        }
                        catch(Exception e){
                                    JOptionPane.showMessageDialog(null,e);
                                    dispose();
                        }

                        btnSave.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent ae){
                                                try{
                                                            int cid = Integer.parseInt(txtID.getText());
                                                            String cname = txtName.getText();
                                                            String addr = txtAddr.getText();
                                                            int yr = Integer.parseInt(txtYear.getText());

                                                            ps = con.prepareStatement("insert into college values(?,?,?,?)");
                       
                                                            ps.setInt(1,cid);
                                                            ps.setString(2,cname);
                                                            ps.setString(3,addr);
                                                            ps.setInt(4,yr);

                                                            ps.executeUpdate();

                                                            txtID.setText("");
                                                            txtName.setText("");
                                                            txtAddr.setText("");
                                                            txtYear.setText("");

                                                            txtID.requestFocus();
                                                }
                                                catch(Exception e){   
                                                            JOptionPane.showMessageDialog(null,e);
                                                }
                                    }
                        });                                           

                        btnClose.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent ae){
                                                dispose();
                                    }
                        });
            }

            public static void main(String args[]){
                        new College();
            }
}