import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;

class EmpView extends JFrame{
	private JTable tabRecord;
	private JLabel lblEmp;
	private JComboBox cmbEmp;
	private JPanel panNorth;
	private DefaultTableModel dtm;

	private Connection con;
	private PreparedStatement ps;
	private Statement s;
	private ResultSet rs;

	public EmpView(){
		lblEmp = new JLabel("Employee:");
		cmbEmp = new JComboBox();

		panNorth = new JPanel();
		panNorth.add(lblEmp);
		panNorth.add(cmbEmp);

		dtm = new DefaultTableModel();
		dtm.addColumn("EmpNo");
		dtm.addColumn("Name");
		dtm.addColumn("Salary");
		dtm.addColumn("Designation");

		tabRecord = new JTable(dtm);

		setTitle("View Employee");
		setSize(500,150);
		add(panNorth,"North");
		add(new JScrollPane(tabRecord),"Center");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		try{
			//Class.forName("oracle.jdbc.OracleDriver");

			//con = DriverManager.getConnection("jdbc:oracle:thin:tybca/bca@localhost:1521:XE");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://Database1.accdb");

			s = con.createStatement();

			rs = s.executeQuery("select * from emp");
			cmbEmp.addItem("---");
			while(rs.next()){
				cmbEmp.addItem(rs.getString(2));
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
		}
	
		cmbEmp.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				try{
					String en = cmbEmp.getSelectedItem().toString();
					ps = con.prepareStatement("select * from emp where ename=?");
					ps.setString(1,en);
					rs = ps.executeQuery();
					if(rs.next()){
						Vector rec = new Vector();
						rec.add(rs.getString(1));
						rec.add(rs.getString(2));
						rec.add(rs.getString(3));
						rec.add(rs.getString(4));

						if(dtm.getRowCount()>0)
							dtm.removeRow(0);
						dtm.addRow(rec);
					} 
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
	}

	public static void main(String args[]){
		new EmpView();
	}
}




		

