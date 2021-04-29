<%-- 
    Document   : elogoutDB
    Created on : 27 Mar, 2021, 11:50:34 AM
    Author     : Dishen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String loginUser = (String)session.getAttribute("User");
    session.removeAttribute("User");
    response.sendRedirect("ecomDB.jsp");
%>
