import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class DDLOperations extends JFrame{
	private JPanel panNorth,panSouth;
	private JLabel lblQuery;
	private JTextArea txtQuery;
	private JButton btnCreate,btnAlter,btnDrop;

	public DDLOperations(){
		lblQuery = new JLabel("Type DDL Query");
		txtQuery = new JTextArea(4,50);
		
		panNorth = new JPanel();
		panNorth.add(lblQuery);
		panNorth.add(new JScrollPane(txtQuery));

		btnCreate = new JButton("Create Table");
		btnAlter = new JButton("Alter Table");
		btnDrop = new JButton("Drop Table");

		panSouth = new JPanel();
		panSouth.add(btnCreate);
		panSouth.add(btnAlter);
		panSouth.add(btnDrop);

		setTitle("DDL Operations");
		setSize(400,300);
		add(panNorth,"North");
		add(panSouth,"South");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonHandler bh = new ButtonHandler();
		btnCreate.addActionListener(bh);
		btnAlter.addActionListener(bh);
		btnDrop.addActionListener(bh);
	}

	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			try{
				Class.forName("oracle.jdbc.OracleDriver");
	
				Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:tybca/bca@localhost:1521:XE");

				String sql = txtQuery.getText();
				Statement s = con.createStatement();
				s.execute(sql);
				txtQuery.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
			}
		}
	}

	public static void main(String args[]){
		new DDLOperations();
	}
}