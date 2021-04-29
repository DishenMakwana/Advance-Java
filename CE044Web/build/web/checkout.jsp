<%-- 
    Document   : checkout
    Created on : 26 Mar, 2021, 11:31:01 AM
    Author     : Dishen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="ecomHeader.jsp" %>
<title>Checkout</title>
<link rel="stylesheet" href="css/checkout.css" />
</head>

<body>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">
            <h1 class="logo"><a href="ecomIndex.jsp">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="ecomIndex.jsp" class="logo"
               ><img src="assets/img/logo.png" alt=""
                  /></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto" href="ecomIndex.jsp">Home</a></li>
                    <!--<li><a class="nav-link scrollto " href="#portfolio">Portfolio</a></li>-->
                    <!--<li><a class="nav-link scrollto" href="#footer">Contact</a></li>-->
                    <li>
                        <a class="nav-link scrollto" href="viewcart.jsp">View Cart</a>
                    </li>
                    <li><a class="nav-link scrollto active" href="checkout.jsp">Checkout</a></li>
                    <li><a class="nav-link scrollto" href="elogin.jsp">Login</a></li>
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
        <!--	    <br>
                          <h1 align="center">Thanks for shopping.<br>
                              Please update Shopping Address.</h1>-->
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
                                <input type="radio" name="COD" value="COD" />
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
        String paymentMethod = request.getParameter("COD");
        if (paymentMethod == null) {
            paymentMethod = "No Payment method selected";
        }
    %>
    <main id="main">
        <br><table class="styled-table center">
            <tr>
                <td>Name : <%=name%></td>
            </tr>
            <tr>
                <td>Contect Number : <%=contectNo%></td>
            </tr>
            <tr>
                <td>Address : <%=address%></td>
            </tr>
            <tr>
                <td class="active-row">Payment Method : <%=paymentMethod%></td>
            </tr>
        </table>
    </main>
    <% }%>
    <% session.removeAttribute("product");%>

    <%@include file="ecomFooter.jsp" %>
