<%-- 
    Document   : editProduct
    Created on : 26 Mar, 2021, 1:08:06 PM
    Author     : Dishen
--%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="ecomHeader.jsp" %>
<title>Edit Cart</title>
<link rel="stylesheet" href="css/viewcart.css">
</head>

<body>
    <%
        HashMap<Integer, Product> cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");
        double grandTotal = 0;
    %>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">

            <h1 class="logo"><a href="ecommerce.jsp">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="ecomIndex.jsp" class="logo"><img src="assets/img/logo.png" alt=""></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto" href="ecomIndex.jsp">Home</a></li>
                    <!--<li><a class="nav-link scrollto " href="#portfolio">Portfolio</a></li>-->
                    <!--<li><a class="nav-link scrollto" href="#footer">Contact</a></li>-->
                    <li><a class="nav-link scrollto" href="viewcart.jsp">View Cart</a></li>
                    <li><a class="nav-link scrollto active" href="editProduct.jsp">Edit Cart</a></li>
                    <li><a class="nav-link scrollto" href="checkout.jsp">Checkout</a></li>
                    <li><a class="nav-link scrollto" href="elogin.jsp">Login</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav><!-- navbar -->

        </div>
    </header><!-- End Header -->

    <main id="main">
        <%
            if (cartProducts == null || cartProducts.isEmpty()) {
                response.sendRedirect("viewcart.jsp");
            } else { %>
        <br>
        <br>

        <table class="styled-table center">
            <thead class="text-justify">
                <tr>
                    <th>ProductId</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total Price</th>
                    <th></th>
                </tr>
            </thead>
            <% for (Map.Entry<Integer, Product> entry : cartProducts.entrySet()) {
                    int key = entry.getKey();
                    Product p = entry.getValue();
            %>
            <tbody class="text-justify">
                <tr>
            <form action="editDltAction.jsp" action="POST">
                <td><%=key%></td>
                <td><%=p.getPrice()%></td>
                <td><input type="number" name="qty" value="<%=p.getQty()%>"/></td>
                <td><%=(p.getQty() * p.getPrice())%></td>
                <td>
                    <input type="hidden" name="editProductId" value="<%=key%>">
                    <input type="submit" class="btn btn-primary" value="Add">
                </td>
            </form>
            </tr>
            <% grandTotal += (p.getQty() * p.getPrice()); %>
            <% }%>
            <tr>
                <td colspan="4" class="active-row">GrandTotal</td>
                <td><%=grandTotal%></td>

            </tr>
            </tbody>
        </table>
        <br>
        <div class="text-center mb-3">
            <a href="viewcart.jsp"><button class="btn btn-dark " >Done Shopping ..</button>
        </div>
        <% }%>

    </main><!-- End #main -->

    <%@include file="ecomFooter.jsp" %>
