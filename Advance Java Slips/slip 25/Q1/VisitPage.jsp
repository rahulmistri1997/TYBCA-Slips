<html>
<body>
<%!
       int cnt=0;
       String uname,nname;
%>
<%
      uname=request.getParameter("uname");
       nname=request.getParameter("nname");
       cnt++;
      if(cnt%2==0)
       out.println("Hello "+nname+".........    Visit Count   "+cnt);
      else
       out.println("Hello "+uname+".........    Visit Count   "+cnt);
%>
<br><br>
<a href="run.html">VISIT</a>
</body>
</html>