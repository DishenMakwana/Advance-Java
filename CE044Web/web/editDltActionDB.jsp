<%-- 
    Document   : editDltActionDB
    Created on : 9 Apr, 2021, 12:38:39 AM
    Author     : Dishen
--%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int productId = Integer.parseInt(request.getParameter("editProductId"));
    int qty = Integer.parseInt(request.getParameter("qty"));

    if (qty == 0) {
        HashMap<Integer, Product> cartData = (HashMap<Integer, Product>) session.getAttribute("product");
        Product return_value = (Product) cartData.remove(productId);
        session.setAttribute("product", cartData);
        response.sendRedirect("editCartProductDB.jsp");
        
    } else {

        HashMap<Integer, Product> cartProduct = (HashMap<Integer, Product>) session.getAttribute("product");

        if (cartProduct.containsKey(productId)) {

            Product exProduct = cartProduct.get(productId);
            exProduct.setQty(qty);

            cartProduct.replace(productId, exProduct);
        }

        session.setAttribute("product", cartProduct);
        response.sendRedirect("editCartProductDB.jsp");
    }
%>
