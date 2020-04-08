<%@page import="java.sql.*"%>

<%
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:lab.dsn");
Statement s = con.createStatement();
ResultSet rs = s.executeQuery("select * from account");
%>
<table border=1>
<tr><th>Account No</th><th>Type</th><th>Balance</th></tr>
<%
while(rs.next()){
%>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getFloat(3)%></td>
</tr>
<%
            }
%>
</table><br>
<a href='account.html'>Home</a>