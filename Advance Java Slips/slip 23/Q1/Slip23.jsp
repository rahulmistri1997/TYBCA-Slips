<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    int rno = Integer.parseInt(request.getParameter("rno"));
   
    String s_name = request.getParameter("name");
   
    String s_gender = request.getParameter("gender");
   
    String s_know = request.getParameter("know");
   
    String s_class = request.getParameter("Class");
         
    out.println("\nRoll No :"+rno);
    out.println("\nName :"+s_name);
    out.println("\nGender :"+s_gender);
    out.println("\nComp_Know :"+s_know);
    out.println("\nClass :"+s_class);
%>