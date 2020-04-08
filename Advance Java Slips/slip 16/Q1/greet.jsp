<%@page import="java.util.*"%>
<%
	String uname = request.getParameter("uname");

	Date d = new Date();

	if(d.getHours()<11){
%>
Good morning
<%
	}
	else if(d.getHours()<17){
%>
Good afternoon
<%
	}
	else{
%>
Good evening
<%
	}
%>
<%=" "+uname%>