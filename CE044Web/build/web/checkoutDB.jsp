<%-- 
    Document   : checkoutDB
    Created on : 9 Apr, 2021, 12:40:56 AM
    Author     : Dishen
--%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Checkout</title>
<link rel="stylesheet" href="css/checkout.css" />
<link rel="stylesheet" href="css/viewcart.css">
</head>
<%
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prst = null;
%>
<%@include file="connectionDB.jsp" %>

<body>
    <%        
        String sessionUser = (String) session.getAttribute("User");
//        String sessionUserId = (String) session.getAttribute("UserId");

        String userQry = "SELECT * FROM user WHERE username=?";
        prst = connection.prepareStatement(userQry);
        prst.setString(1, sessionUser);
        rs = prst.executeQuery();

        int userId = 1, detailId = 0;
        if (rs.next()) {
            userId = rs.getInt("userid");
            detailId = rs.getInt("detailId");
        }

        String paymentQry = "SELECT paymentMethod FROM personal_details WHERE userId=?";
        prst = connection.prepareStatement(paymentQry);
        prst.setInt(1, userId);
        rs = prst.executeQuery();

        String paymentMethod = "No Payment method selected";
        if (rs.next()) {
            paymentMethod = rs.getString("paymentMethod");
        }
    %>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">
            <h1 class="logo"><a href="ecomDB.jsp">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="ecomDB.jsp" class="logo"
               ><img src="assets/img/logo.png" alt=""
                  /></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto" href="ecomDB.jsp">Home</a></li>
                    <li>
                        <a class="nav-link scrollto" href="viewcartDB.jsp">View Cart</a>
                    </li>
                    <li><a class="nav-link scrollto active" href="checkoutDB.jsp">Checkout</a></li>
                    <li><a class="nav-link scrollto" href="eloginDB.jsp">Login</a></li>
                    <li><a class="nav-link scrollto" href="elogoutDB.jsp">Logout</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav>
            <!-- .navbar -->
        </div>
    </header>
    <!-- End Header -->
    <%
        if (request.getParameter("party_name") == null) {
    %>
    <main id="main">
        <div class="container-fluid">
            <div class="container">
                <div class="formBox">
                    <form method="post" action="">
                        <div class="row">
                            <div class="col-sm-12">
                                <h1>Shipping Address</h1>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Your Name</div>
                                    <input type="text" name="party_name" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Email</div>
                                    <input type="text" name="email" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Mobile</div>
                                    <input type="text" name="contect_no" class="input" />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Address</div>
                                    <input type="text" name="Shipping_address" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <div class="inputBox">
                                <input type="radio" name="COD" value="COD" <%-- <% if (paymentMethod == "COD") { %> checked="true" <% } %> --%>/>
                                Cash on Delivery
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-12">
                                <input
                                    type="submit"
                                    name="Submit"
                                    class="button"
                                    value="Checkout"
                                    />
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </main>
    <!-- End #main -->
    <% } else {%>
    <%
        String name = request.getParameter("party_name");
        String contectNo = request.getParameter("contect_no");
        String address = request.getParameter("Shipping_address");

        HashMap<Integer, Product> cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");

        int orderId = 1, productId, productQty;
        String productName;
        double productPrice, totalPrice = 0.0;

        for (Map.Entry<Integer, Product> entry : cartProducts.entrySet()) {
            int key = entry.getKey();
            Product p = entry.getValue();

            totalPrice += (p.getPrice() * p.getQty());
        }

        String orderQry = "INSERT INTO `orders` (userId, totalPrice) VALUES (?,?)";
        prst = connection.prepareStatement(orderQry);
        prst.setInt(1, userId);
        prst.setDouble(2, totalPrice);
        prst.executeUpdate();

        String orderIdFetchQry = "SELECT * FROM orders WHERE userId=? and totalPrice=?";
        prst = connection.prepareStatement(orderIdFetchQry);
        prst.setInt(1, userId);
        prst.setDouble(2, totalPrice);
        rs = prst.executeQuery();

        if (rs.next()) {
            orderId = rs.getInt("orderId");
        }

        for (Map.Entry<Integer, Product> entry : cartProducts.entrySet()) {
            int key = entry.getKey();
            Product p = entry.getValue();

            productId = key;
            productName = p.getPname();
            productPrice = p.getPrice();
            productQty = p.getQty();

            String orderProductAddQry = "INSERT INTO products (orderId,productId,productName,productPrice,productQty) VALUES (?,?,?,?,?)";
            prst = connection.prepareStatement(orderProductAddQry);
            prst.setInt(1, orderId);
            prst.setInt(2, productId);
            prst.setString(3, productName);
            prst.setDouble(4, productPrice);
            prst.setInt(5, productQty);
            prst.executeUpdate();
        }

        if (detailId == 0) {
            String personalDetailQry = "INSERT INTO personal_details (userId,userName,mobileNumber,address,paymentMethod) VALUES (?,?,?,?,?)";
            prst = connection.prepareStatement(personalDetailQry);
            prst.setInt(1, userId);
            prst.setString(2, sessionUser);
            prst.setString(3, contectNo);
            prst.setString(4, address);
            prst.setString(5, paymentMethod);
            prst.executeUpdate();

            String detailQry = "SELECT detailId FROM personal_details WHERE userId=?";
            prst = connection.prepareStatement(detailQry);
            prst.setInt(1, userId);
            rs = prst.executeQuery();

            if (rs.next()) {
                detailId = rs.getInt("detailId");
            }

            String userDetailQry = "UPDATE user SET detailId=? WHERE userid=?";
            prst = connection.prepareStatement(userDetailQry);
            prst.setInt(1, detailId);
            prst.setInt(2, userId);
            prst.executeUpdate();
        }

        session.removeAttribute("product");
        response.sendRedirect("ordersDB.jsp");
        }
    %>

    <%@include file="ecomFooter.jsp" %>