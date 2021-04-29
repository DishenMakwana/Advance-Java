<%-- 
    Document   : authDB
    Created on : 9 Apr, 2021, 12:10:02 AM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prst = null;
%>
<%@include file="connectionDB.jsp" %>

<%  
    String sessionUser = (String) session.getAttribute("User");
//    out.println(session.getAttribute("User"));
    
    if(sessionUser.equals(null))
    {
        response.sendRedirect("eloginDB.jsp");
    }

    String checkQry = "SELECT * FROM user where username=?";
    prst = connection.prepareStatement(checkQry);
    prst.setString(1,sessionUser); //Name 
    rs = prst.executeQuery();

    if (rs.next()) {
        String status = (String) rs.getString("role");//role of any User
        out.println(status);

        if (status != "admin") {
            response.sendRedirect("ecomDB.jsp");
        }
    }
%>
