<%-- 
    Document   : addProducts
    Created on : 27 Mar, 2021, 12:55:52 PM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Admin Add Products Page</title>
<link rel="stylesheet" href="css/checkout.css" />
</head>
<%
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prst = null;
%>
<%@include file="connectionDB.jsp" %>

<body>
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
                    <li><a class="nav-link scrollto active" href="addProducts.jsp">Admin Page</a></li>
                    <li><a class="nav-link scrollto" href="adminProducts.jsp">Admin Product</a></li>
                    <li><a class="nav-link scrollto" href="eloginDB.jsp">Login</a></li>
                    <li><a class="nav-link scrollto" href="elogoutDB.jsp">Logout</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav>
            <!-- .navbar -->
        </div>
    </header>
    <!-- End Header -->

    <main id="main">
        <div class="container-fluid">
            <div class="container">
                <div class="formBox">
                    <form method="post" action="">
                        <div class="row">
                            <div class="col-sm-12">
                                <h1>Product Details</h1>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Product Name</div>
                                    <input type="text" name="pname" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Product Stock</div>
                                    <input type="number" name="stock" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Product Image</div>
                                    <input type="text" name="image" class="input" />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="inputBox">
                                    <div class="inputText">Product Price</div>
                                    <input type="number" name="price" class="input" />
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-12">
                                <input
                                    type="submit"
                                    name="Submit"
                                    class="button"
                                    value="Add Product"
                                    />
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </main>
    <!-- End #main -->

    <%        
        if (request.getParameter("pname") != null && request.getParameter("stock") != null && request.getParameter("image") != null && request.getParameter("price") != null) {

            String pname = request.getParameter("pname");
            int stock = Integer.parseInt(request.getParameter("stock"));
            String image = request.getParameter("image");
            double price = Double.parseDouble(request.getParameter("price"));

            String addQry = "INSERT INTO `product_master` (`pid`, `pname`, `stock`, `image`, `price`) VALUES (NULL, ?, ?, ?, ?) ";

            prst = connection.prepareStatement(addQry);
            prst.setString(1, pname);
            prst.setInt(2, stock);
            prst.setString(3, image);
            prst.setDouble(4, price);
            int row = prst.executeUpdate();

            response.sendRedirect("addProducts.jsp");
        }
    %>

    <%@include file="ecomFooter.jsp" %>

