<html>
<body>

<%! int n,cnt,i,j; %>
<% n=Integer.parseInt(request.getParameter("t1"));

for(i=1;i<=n;i++)
{
  cnt=0;
  for(j=2;j<i;j++)
   {
     if(i%j==0)
     {
       cnt++;
     }
   }
   if(cnt==0)
   {
%><br><font color=blue size=5>
<%
      out.println("  "+i);
   }
}
%>
</body>
</html>