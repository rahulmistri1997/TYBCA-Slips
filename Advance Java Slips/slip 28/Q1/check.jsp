<%@include file="armstrong.jsp"%>
<%
	int n = Integer.parseInt(request.getParameter("no"));

	if(isArmstrong(n))
		out.print(n+" is Armstrong");
	else
		out.print(n+" is not Armstrong");
%>