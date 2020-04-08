import java.sql.*;

class Elements{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:tybca/bca@localhost:1521:XE");

			Statement s=null;
			PreparedStatement ps=null;
			ResultSet rs=null;

			char ch = args[0].charAt(0);

			String name="",symbol="";
			int weight=0;
			
			switch(ch)
			{
			case 'R':
				s = con.createStatement();
				rs = s.executeQuery("select * from elements");
				while(rs.next()){
					System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+
						rs.getString(3));
				}
				break;
			case 'D':
				name = args[1];
				ps = con.prepareStatement("delete from elements where name=?");
				ps.setString(1,name);
				if(ps.executeUpdate()==1)
					System.out.println("Element "+name+" deleted successfully.");
				else
					System.out.println("Element "+name+" not found.");				
				break;
			case 'U':
				weight = Integer.parseInt(args[1]);
				name = args[2];
				symbol = args[3];

				ps = con.prepareStatement("update elements set atomic_weight=?,chemical_symbol=? where name=?");

				ps.setInt(1,weight);
				ps.setString(2,symbol);
				ps.setString(3,name);

				if(ps.executeUpdate()==1)
					System.out.println("Element "+name+" updated successfully.");
				else
					System.out.println("Element "+name+" not found.");				
			}

			con.close();				
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}