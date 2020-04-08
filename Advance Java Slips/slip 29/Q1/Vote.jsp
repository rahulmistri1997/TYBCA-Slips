<html>
<body>
<%! int n; %>
<% n=Integer.parseInt(request.getParameter("t1"));
if(n>=18)
out.print("You are eligible for voting....!");
else
out.print("You are not eligible for voting....!");
%>
</body>
</html>