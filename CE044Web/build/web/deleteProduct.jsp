<%-- 
    Document   : deleteProduct
    Created on : 26 Mar, 2021, 11:26:20 AM
    Author     : Dishen
--%>

<%@page import="java.util.HashMap"%>
<%@page import="com.vvp.web.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int deleteProductId = Integer.parseInt(request.getParameter("deleteProductId"));

    HashMap<Integer, Product> cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");
    Product return_value = (Product) cartProducts.remove(deleteProductId);

    session.setAttribute("product", cartProducts);
    response.sendRedirect("viewcart.jsp");
%>
