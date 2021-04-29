<%-- 
    Document   : ecomIndex
    Created on : 25 Mar, 2021, 10:47:25 PM
    Author     : Dishen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Login Page</title>
<link rel="stylesheet" href="css/loginstyle.css" />
</head>

<body>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">
            <h1 class="logo"><a href="index_1.html">DM-Mart</a></h1>
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
                        <a class="nav-link scrollto" href="viewcart.jsp ">View Cart</a>
                    </li>
                    <li>
                        <a class="nav-link scrollto active" href="elogin.jsp">Login</a>
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
    <% if (request.getParameter("username") != null) {
            if (request.getParameter("username") != null && request.getParameter("password") != null) {
                if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("12345")) {

                    Cookie c = new Cookie("user_name", request.getParameter("username"));
                    c.setMaxAge(60 * 60 * 24 * 15);
                    Cookie cpw = new Cookie("password", request.getParameter("password"));
                    cpw.setMaxAge(60 * 60 * 24 * 15);
                    response.addCookie(cpw);
                    response.addCookie(c);
                    response.sendRedirect("ecomIndex.jsp");
                } else {
//                    out.println("<h1>plz Enter correct id and password</h1>");
                    RequestDispatcher rd = request.getRequestDispatcher("elogin.jsp");
                    rd.include(request, response);
                }
            } else {
//                out.println("<h1>plz Enter  id and password</h1>");
                RequestDispatcher rd = request.getRequestDispatcher("elogin.jsp");
                rd.include(request, response);
            }
        }%>
    <!-- End #main -->
    <%@include file="ecomFooter.jsp" %>
