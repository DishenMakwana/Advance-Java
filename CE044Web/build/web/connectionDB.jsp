<%-- 
    Document   : connectionDB.jsp
    Created on : 1 Apr, 2021, 10:37:25 AM
    Author     : Dishen
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! Connection connection = null;%>
<%
    connection = (Connection) application.getAttribute("connection");
    if (connection == null) {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce21", "root", "");
        application.setAttribute("connection", connection);
    }
%>
