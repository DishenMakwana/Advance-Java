<%-- 
    Document   : editDltAction
    Created on : 26 Mar, 2021, 9:30:55 PM
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
        response.sendRedirect("editCartProduct.jsp");
        
    } else {

        HashMap<Integer, Product> cartProduct = (HashMap<Integer, Product>) session.getAttribute("product");

        if (cartProduct.containsKey(productId)) {

            Product exProduct = cartProduct.get(productId);
            exProduct.setQty(qty);

            cartProduct.replace(productId, exProduct);
        }

        session.setAttribute("product", cartProduct);
        response.sendRedirect("editCartProduct.jsp");
//        RequestDispatcher rd = request.getRequestDispatcher("editProduct.jsp");
//        rd.include(request, response);
    }
%>
