<%-- 
    Document   : ecom_hyber
    Created on : 16 Apr, 2021, 1:02:28 PM
    Author     : Dishen
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.vvp.web.HUtil"%>
<%@page import="org.hibernate.Session" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Ecommerce</title>
</head>

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
                        Session hSession = HUtil.getSessionFactory().openSession();
                        Transaction tx = hSession.beginTransaction();
                        Query q = hSession.createQuery("from ProductMaster pm");
                        Iterator it = q.list().iterator();

                        while (it.hasNext()) {
                            ProductMaster databaseProduct = (ProductMaster) it.next();
                    %>
                    <div class="col-lg-4 col-md-6 portfolio-item filter-app">
                        <img src="<%=databaseProduct.getImage()%>" class="img-fluid" alt="">

                        <div class="portfolio-info">
                            <h4><%=databaseProduct.getPname()%></h4>
                            <p>$ <%=databaseProduct.getPrice()%></p>
                            <p>Stock: <%=databaseProduct.getStock()%></p>

                            <a href="<%=databaseProduct.getImage()%>" data-gallery="portfolioGallery"
                               class="portfolio-lightbox preview-link" title="App <%=databaseProduct.getPid()%>"><i class="bx bx-plus"></i></a>
                            <a href="portfolio-details.html" class="details-link" title="More Details"><i
                                    class="bx bx-link"></i></a>
                            <br>

                            <form action="addtocartDB.jsp" method="get">
                                <input type="number" name="qty" value="1" />
                                <input type="hidden" name="pid" value="<%=databaseProduct.getPid()%>" />
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
