<%@page import="java.sql.*"%>

<%
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:tybca/bca@localhost:1521:XE");

	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select * from hospital");
%>
<table border=1>
<tr>
	<th>Hospital No</th>
	<th>Name</th>
	<th>Address</th>
</tr>
<%
	while(rs.next()){
%>
<tr>
	<td><%=rs.getInt(1)%></td>
	<td><%=rs.getString(2)%></td>
	<td><%=rs.getString(3)%></td>
</tr>
<%
	}
%>
</table>