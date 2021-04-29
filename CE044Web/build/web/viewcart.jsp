<%-- Document : viewcart Created on : 20 Mar, 2021, 12:55:58 PM Author : Dishen Makwana --%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@include file="ecomHeader.jsp" %>
<link rel="stylesheet" href="css/viewcart.css">
<title>View Cart</title>
</head>

<body>
    <%
        double grandTotal = 0;
        String User = (String) session.getAttribute("User");
        HashMap<Integer, Product> cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");
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
                    <li><a class="nav-link scrollto active" href="viewcart.jsp">View Cart</a></li>
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
        %>
        <br>
        <h1 style="text-align: center;">Hey <%=User == null ? "" : User%>, Welcome to DM-Mart's Shopping Cart</h1>
        <br>
        <table class="styled-table center">
            <thead class="text-justify">
                <tr style="text-align: center;">
                    <th>Your cart is empty</th>
                </tr>
            </thead>
        </table>
        <% } else { %>
        <br>
        <h1 style="text-align: center;">Hey <%=User == null ? "" : User%>, Welcome to DM-Mart's Shopping Cart</h1>
        <br>

        <table class="styled-table center">
            <thead>
                <tr>
                    <th>ProductId</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total Price</th>
                    <th><a href="editCartProduct.jsp"><button class="btn btn-primary">Edit</button></a></th>
                </tr>
            </thead>
            <% for (Map.Entry<Integer, Product> entry : cartProducts.entrySet()) {
                    int key = entry.getKey();
                    Product p = entry.getValue();
            %>
            <tbody>
                <tr>
                    <td><%=key%></td>
                    <td><%=p.getPrice()%></td>
                    <td><%=p.getQty()%></td>
                    <td><%=(p.getQty() * p.getPrice())%></td>
                    <td>
                        <form action="deleteProduct.jsp" action="POST">
                            <input type="hidden" name="deleteProductId" value="<%=key%>">
                            <input type="submit" class="btn btn-danger" value="Delete">
                        </form>
                    </td>
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
            <a href="ecomIndex.jsp"><button class="btn btn-dark " >Continue Shopping ..</button>
            <a href="checkout.jsp"><button class="btn btn-dark" >Proceed To Checkout ..</button>
        </div>
        <% }%>

    </main><!-- End #main -->

<%@include file="ecomFooter.jsp" %>