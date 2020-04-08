<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String username=(String)session.getAttribute("username");
if(username!=null)
{
out.println(username+" loged out, <a href=\"Slip1.jsp\">Back</a>");
session.removeAttribute("username");
}
else
{
out.println("You are already not login <a href=\"Slip1.jsp\">Back</a>");
}
%>