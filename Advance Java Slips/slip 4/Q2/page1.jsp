<%
String s[] = request.getParameterValues("prod");
int tot=0;
for(int i=0;i<s.length;i++){
tot+=Integer.parseInt(s[i]);
}
session.setAttribute("tot1", tot);
response.sendRedirect("Page2.html");
%>