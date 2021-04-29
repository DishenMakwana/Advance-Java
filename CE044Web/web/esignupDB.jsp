<%-- 
    Document   : esignupDB
    Created on : 27 Mar, 2021, 12:07:37 PM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Signup Page</title>
<link rel="stylesheet" href="css/loginstyle.css" />
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
                    <li>
                        <a class="nav-link scrollto" href="viewcartDB.jsp ">View Cart</a>
                    </li>
                    <li>
                        <a class="nav-link scrollto" href="eloginDB.jsp">Login</a>
                    </li>
                    <li>
                        <a class="nav-link scrollto active" href="esignupDB.jsp">Sign Up</a>
                    </li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav>
            <!-- navbar -->
        </div>
    </header>
    <!-- End Header -->
    <main id="main">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 order-md-2">
                        <img
                            src="./img/undraw_file_sync_ot38.svg"
                            alt="Image"
                            class="img-fluid"
                            />
                    </div>
                    <div class="col-md-6 contents">
                        <div class="row justify-content-center">
                            <div class="col-md-8">
                                <div class="mb-4">
                                    <h3>Sign In to <strong>DM Mart</strong></h3>
                                    <p class="mb-4"></p>
                                </div>
                                <form action="" method="post">
                                    <div class="form-group first">
                                        <label for="username">Username</label>
                                        <input
                                            type="text"
                                            name="username"
                                            class="form-control"
                                            id="username"
                                            />
                                    </div>
                                    <div class="form-group first">
                                        <label for="email">Email</label>
                                        <input
                                            type="text"
                                            name="email"
                                            class="form-control"
                                            id="email"
                                            />
                                    </div>
                                    <div class="form-group last mb-4">
                                        <label for="password1">Password</label>
                                        <input
                                            type="password"
                                            name="password1"
                                            class="form-control"
                                            id="password1"
                                            />
                                    </div>
                                    <div class="form-group last mb-4">
                                        <label for="password">Confirm Password</label>
                                        <input
                                            type="password"
                                            name="password2"
                                            class="form-control"
                                            id="password2"
                                            />
                                    </div>

                                    <div class="d-flex mb-5 align-items-center">
                                        <label class="control control--checkbox mb-0"
                                               ><span class="caption">Remember me</span>
                                            <input type="checkbox" checked="checked" />
                                            <div class="control__indicator"></div>
                                        </label>
                                        <span class="ml-auto"
                                              ><a href="#" class="forgot-pass"
                                            >Forgot Password</a
                                            ></span
                                        >
                                    </div>

                                    <input
                                        type="submit"
                                        value="Sign Up"
                                        class="btn text-white btn-block btn-primary"
                                        />

                                    <span class="d-block text-left my-4 text-muted">
                                        or sign in with</span
                                    >

                                    <div class="social-login">
                                        <a href="#" class="facebook">
                                            <span class="icon-facebook mr-3"></span>
                                        </a>
                                        <a href="#" class="twitter">
                                            <span class="icon-twitter mr-3"></span>
                                        </a>
                                        <a href="#" class="google">
                                            <span class="icon-google mr-3"></span>
                                        </a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <%        
        if (request.getParameter("username") != null) {
            if (request.getParameter("username") != null && request.getParameter("email") != null && request.getParameter("password1") != null && request.getParameter("password2") != null) {

                String userName = (String) request.getParameter("username");
                String email = (String) request.getParameter("email");
                String passWord1 = (String) request.getParameter("password1");
                String passWord2 = (String) request.getParameter("password2");
                boolean isUserExist = false;

                if (passWord1.equals(passWord2)) {

                    String loginQry = "SELECT username,password FROM user where username=?";
                    prst = connection.prepareStatement(loginQry);
                    prst.setString(1, userName);
                    rs = prst.executeQuery();

                    if (rs.next()) {
                        isUserExist = true;
                    }

                    if (!isUserExist) {
                        String signupQry = "INSERT INTO `user` VALUES (NULL,?,?,?,?);";
                        prst = connection.prepareStatement(signupQry);
                        prst.setString(1, userName);
                        prst.setString(2, passWord1);
                        prst.setString(3, email);
                        prst.setString(4, "user");

                        prst.executeUpdate();
                    }
                }
                if (isUserExist) {
                    response.sendRedirect("eloginDB.jsp");
                } else {
                    response.sendRedirect("esignupDB.jsp");
                }
            } else {
                response.sendRedirect("esignupDB.jsp");
            }
        }
    %>
    <!-- End #main -->
    <%@include file="ecomFooter.jsp" %>