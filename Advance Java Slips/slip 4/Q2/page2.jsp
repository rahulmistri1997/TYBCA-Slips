<%
String s[] = request.getParameterValues("prod");
int tot=0;
for(int i=0;i<s.length;i++){
tot+=Integer.parseInt(s[i]);
}
int tot1 = Integer.parseInt(session.getAttribute("tot1").toString());
%>
<table border=1>
<tr><td><b>Page 1:</b></td><td>Rs.<%=tot1%>/-</td></tr>
<tr><td><b>Page 2:</b></td><td>Rs.<%=tot%>/-</td></tr>
<tr><td><b>Grand Total:</b></td><td>Rs.<%=tot1+tot%>/-</td></tr>
</table>