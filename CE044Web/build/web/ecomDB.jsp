<%-- 
    Document   : ecomDB
    Created on : 24 Mar, 2021, 10:04:15 PM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Ecommerce</title>
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
            <a href="ecomDB.jsp" class="logo"><img src="assets/img/logo.png" alt=""></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto active" href="ecomDB.jsp">Home</a></li>
                    <li><a class="nav-link scrollto" href="viewcartDB.jsp">View Cart</a></li>
                    <li><a class="nav-link scrollto " href="eloginDB.jsp">Login</a></li>
                    <li><a class="nav-link scrollto " href="elogoutDB.jsp">Logout</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav><!-- navbar -->
        </div>
    </header><!-- End Header -->

    <main id="main">

        <!-- ======= Portfolio Section ======= -->
        <section id="portfolio" class="portfolio">
            <div class="container" data-aos="fade-up">

                <div class="section-title">
                    <h2>Portfolio</h2>
                    <h3>Check our <span>Portfolio</span></h3>
                </div>

                <div class="row" data-aos="fade-up" data-aos-delay="100">
                    <div class="col-lg-12 d-flex justify-content-center">
                        <ul id="portfolio-flters">
                            <li data-filter="*" class="filter-active">All</li>
                            <li data-filter=".filter-app">App</li>
                            <li data-filter=".filter-card">Card</li>
                            <li data-filter=".filter-web">Web</li>
                        </ul>
                    </div>
                </div>

                <div class="row portfolio-container" data-aos="fade-up" data-aos-delay="200">
                    <%
                        String fetchQry = "SELECT * FROM product_master";
                        prst = connection.prepareStatement(fetchQry);
                        rs = prst.executeQuery();
                        
                        while (rs.next()) {
                            int pid = rs.getInt("pid");
                            int stock = rs.getInt("stock");
                            double price = rs.getDouble("price");
                            String pname = rs.getString("pname");
                            String image = rs.getString("image");
                    %>
                    <div class="col-lg-4 col-md-6 portfolio-item filter-app">
                        <img src="<%=image%>" class="img-fluid" alt="">
                        
                        <div class="portfolio-info">
                            <h4><%=pname%></h4>
                            <p>$ <%=price%></p>
                            <p>Stock: <%=stock%></p>
                            
                            <a href="<%=image%>" data-gallery="portfolioGallery"
                               class="portfolio-lightbox preview-link" title="App <%=pid%>"><i class="bx bx-plus"></i></a>
                            <a href="portfolio-details.html" class="details-link" title="More Details"><i
                                    class="bx bx-link"></i></a>
                            <br>
                            
                            <form action="addtocartDB.jsp" method="get">
                                <input type="number" name="qty" value="1" />
                                <input type="hidden" name="pid" value="<%=pid%>" />
                                <input class="btn btn-dark" type="submit" value="Add to Cart" />
                            </form>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </section><!-- End Portfolio Section -->

    </main><!-- End #main -->

    <%@include file="ecomFooter.jsp" %>
