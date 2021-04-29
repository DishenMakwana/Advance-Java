<%-- 
    Document   : addtocartDB
    Created on : 10 Apr, 2021, 12:10:08 AM
    Author     : Dishen
--%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="java.util.HashMap"%>
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
    int productId = Integer.parseInt(request.getParameter("pid"));
    int qty = Integer.parseInt(request.getParameter("qty"));

    String fetchQry = "SELECT * FROM product_master WHERE pid=?";
    prst = connection.prepareStatement(fetchQry);
    prst.setInt(1, productId);
    rs = prst.executeQuery();

    double price = 0.0;
    String pname = "";
    int stock = 0;
    
    while (rs.next()) {
        price = rs.getInt("price");
        pname = rs.getString("pname");
        stock = rs.getInt("stock");
    }
    
    boolean isStockOver = true;
    if (stock >= qty) {
        stock -= qty;
        String stockQry = "UPDATE product_master SET stock=? WHERE pid=?";
        prst = connection.prepareStatement(stockQry);
        prst.setInt(1, stock);
        prst.setInt(2, productId);
        prst.executeUpdate();
        isStockOver = false;
    }

    if (isStockOver) {
        response.sendRedirect("ecomDB.jsp");
    }
    if (!isStockOver) {
        // Add Cookie
        Cookie cookies[] = request.getCookies();
        Cookie userProduct = new Cookie("productid_" + productId, "qty:" + qty);
        userProduct.setMaxAge(60 * 60 * 24 * 15);     // 15 days

        Product product = new Product(qty, price, pname);
        HashMap<Integer, Product> cartProducts = null;

        if (session.getAttribute("product") == null) {
            cartProducts = new HashMap<Integer, Product>();
            cartProducts.put(productId, product);
        } else {
            cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");

            if (cartProducts.containsKey(productId)) {

                Product exProduct = cartProducts.get(productId);
                exProduct.setQty(exProduct.getQty() + qty);

                cartProducts.replace(productId, exProduct);
            } else {
                cartProducts.put(productId, product);
            }
        }

        session.setAttribute("product", cartProducts);
        response.addCookie(userProduct);

        response.sendRedirect("ecomDB.jsp");
    }
%>
