<%-- 
    Document   : ordersDB
    Created on : 12 Apr, 2021, 1:11:46 PM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>View Cart</title>
<link rel="stylesheet" href="css/viewcart.css">
</head>
<%
    Statement st = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    PreparedStatement prst = null;
%>
<%@include file="connectionDB.jsp" %>

<body>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">

            <h1 class="logo"><a href="ecomDB.jsp">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="ecomDB.jsp" class="logo"><img src="assets/img/logo.png" alt=""></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto" href="ecomDB.jsp">Home</a></li>
                    <li><a class="nav-link scrollto active" href="ordersDB.jsp">Orders</a></li>
                    <li><a class="nav-link scrollto" href="eloginDB.jsp">Login</a></li>
                    <li><a class="nav-link scrollto" href="elogoutDB.jsp">Logout</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav><!-- navbar -->

        </div>
    </header><!-- End Header -->

    <main id="main" style="margin-top: 100px;">
        <%            
            String sessionUser = (String) session.getAttribute("User");

            String userQry = "SELECT * FROM user WHERE username=?";
            prst = connection.prepareStatement(userQry);
            prst.setString(1, sessionUser);
            rs = prst.executeQuery();

            int userId = 1, detailId = 0;
            if (rs.next()) {
                userId = rs.getInt("userid");
                detailId = rs.getInt("detailId");
            }

            String orderQry = "SELECT * FROM orders WHERE userId=? ORDER BY orderId DESC";
            prst = connection.prepareStatement(orderQry);
            prst.setInt(1, userId);
            rs = prst.executeQuery();

            while (rs.next()) {
                int orderId = -1;
                orderId = rs.getInt("orderId");
                double totalPrice = rs.getDouble("totalPrice");
                String orderStatus = rs.getString("orderStatus");

        %>
        <table class="styled-table center">
            <thead>
                <tr style="text-align: center;">
                    <td>Ordered Id - #<%=orderId%></td>
                    <td>OrderStatus - <%=orderStatus%></td>
                    <td>Total Price - $<%=totalPrice%></td>
                </tr>
            </thead>
            <tr style="text-align: center;">
                <td>Product Name</td>
                <td>Product Price</td>
                <td>Quantity</td>
            </tr>

            <%
                String orderProductsQry = "SELECT * FROM products WHERE orderId=?";
                prst = connection.prepareStatement(orderProductsQry);
                prst.setInt(1, orderId);
                rs1 = prst.executeQuery();

                while (rs1.next()) {
                    String pname = rs1.getString("productName");
                    double price = rs1.getDouble("productPrice");
                    int qty = rs1.getInt("productQty");

            %>
            <tbody>
                <tr style="text-align: center;">
                    <td><%=pname%></td>
                    <td><%=price%></td>
                    <td><%=qty%></td>
                </tr>
            </tbody>

            <%
                    }
                }
            %>
        </table>

    </main><!-- End #main -->

    <%@include file="ecomFooter.jsp" %>
