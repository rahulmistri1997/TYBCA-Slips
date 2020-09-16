Slip1.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>Login using jsp</TITLE>
</HEAD>
<BODY>
<H1>LOGIN FORM</H1>
<%
String myname = (String)session.getAttribute("username");
if(myname!=null)
{
    out.println("Welcome "+myname+" , <a href=\"Slip1_logout.jsp\" >Logout</a>");
}
else
{
%>
<form action="Slip1_checklogin.jsp">
<table>
<tr>
<td> Username : </td><td><input name="username" size=15 type="text"

/></td>

</tr>
<tr>
<td> Password : </td><td><input name="password" size=15

type="password" /></td>
</tr>
</table>
<input type="submit" value="login" />
</form>
<%

}
%>
</BODY>
</HTML>