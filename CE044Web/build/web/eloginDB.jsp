<%-- 
    Document   : eloginDB
    Created on : 27 Mar, 2021, 11:18:04 AM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Login Page</title>
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
                        <a class="nav-link scrollto active" href="eloginDB.jsp">Login</a>
                    </li>
                    <li>
                        <a class="nav-link scrollto" href="esignupDB.jsp">Sign Up</a>
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
                                    <div class="form-group last mb-4">
                                        <label for="password">Password</label>
                                        <input
                                            type="password"
                                            name="password"
                                            class="form-control"
                                            id="password"
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
                                        value="Log In"
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
            if (request.getParameter("username") != null && request.getParameter("password") != null) {

                String userName = (String) request.getParameter("username");
                String passWord = (String) request.getParameter("password");

                String loginQry = "SELECT * FROM user where username=? and password=?";
                prst = connection.prepareStatement(loginQry);
                prst.setString(1, userName);
                prst.setString(2, passWord);
                rs = prst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("username");
                    int userId = rs.getInt("userid");
                    String password = rs.getString("password");

                    if (name.equals(userName) && password.equals(passWord)) {

                        Cookie c = new Cookie("user_name", userName);
                        c.setMaxAge(60 * 60 * 24 * 15);
                        Cookie cpw = new Cookie("password", passWord);
                        cpw.setMaxAge(60 * 60 * 24 * 15);
                        response.addCookie(cpw);
                        response.addCookie(c);
                        
                        session.setAttribute("User", userName);
                        session.setAttribute("UserId", userId);
                        response.sendRedirect("ecomDB.jsp");
                    } else {
                        response.sendRedirect("eloginDB.jsp");
                    }
                }
            } else {
                response.sendRedirect("eloginDB.jsp");
            }
        }
    %>
    <!-- End #main -->
    <%@include file="ecomFooter.jsp" %>
