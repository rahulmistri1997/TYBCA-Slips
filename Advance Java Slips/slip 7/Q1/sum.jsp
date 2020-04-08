<%
	String no = request.getParameter("no");

	int a = no.charAt(0) - '0';
	int b = no.charAt(no.length()-1)-'0';

	int sum = a+b;
%>
<font size=18 color='red'>
Sum = <%=sum%>
</font>