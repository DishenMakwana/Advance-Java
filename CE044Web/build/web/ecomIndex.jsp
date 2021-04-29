<%-- 
    Document   : ecomIndex
    Created on : 25 Mar, 2021, 10:47:25 PM
    Author     : Dishen
--%>

<%@page import="java.util.Map"%>
<%@page import="com.vvp.web.Product"%>
<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Ecommerce</title>
</head>

<body>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">

            <h1 class="logo"><a href="index_1.html">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="index_1.html" class="logo"><img src="assets/img/logo.png" alt=""></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <!--<li><a class="nav-link scrollto active" href="index_1.html">Home</a></li>-->
                    <li><a class="nav-link scrollto " href="#portfolio">Portfolio</a></li>
                    <!--<li><a class="nav-link scrollto" href="#footer">Contact</a></li>-->
                    <li><a class="nav-link scrollto" href="viewcart.jsp">View Cart</a></li>
                    <li><a class="nav-link scrollto " href="elogin.jsp">Login</a></li>
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
                    <!--			<p>Ut possimus qui ut temporibus culpa velit eveniet modi omnis est adipisci expedita at voluptas
                                                atque vitae
                                                autem.</p>-->
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
                        HashMap<Integer, ProductMaster> databaseProducts = (HashMap<Integer, ProductMaster>) application.getAttribute("productMaster");
                        for (Map.Entry<Integer, ProductMaster> entry : databaseProducts.entrySet()) {
                            int key = entry.getKey();
                            ProductMaster p = entry.getValue();
                    %>
                    <div class="col-lg-4 col-md-6 portfolio-item filter-app">
                        <img src="<%=p.getImage()%>" class="img-fluid" alt="">
                        <div class="portfolio-info">
                            <h4>App <%=key%></h4>
                            <p>$ <%=p.getPrice()%></p>
                            <p>Stock: <%=p.getStock()%></p>
                            <a href="<%=p.getImage()%>" data-gallery="portfolioGallery"
                               class="portfolio-lightbox preview-link" title="App <%=key%>"><i class="bx bx-plus"></i></a>
                            <a href="portfolio-details.html" class="details-link" title="More Details"><i
                                    class="bx bx-link"></i></a>
                            <br>
                            <form action="" method="get">
                                <input type="number" name="qty" value="1" />
                                <input type="hidden" name="pid" value="<%=key%>" />
                                <!--<input type="hidden" name="price" value="450" />-->
                                <input class="btn btn-dark" type="submit" value="Add to Cart" />
                            </form>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
                <%
                    if ((String) request.getParameter("pid") != null) {
                        int productId = Integer.parseInt(request.getParameter("pid"));
                        int qty = Integer.parseInt(request.getParameter("qty"));

                        // Price Store at Server side
                        double priceProduct[] = {450, 660, 300, 1000, 840, 710, 250, 72, 350};
                        double price = 0.0;
                        for (int i = 0; i < priceProduct.length; i++) {
                            if ((productId - 1) == i) {
                                price = priceProduct[i];
                            }
                        }

                        // Add Cookie
                        Cookie cookies[] = request.getCookies();
                        Cookie userProduct = new Cookie("productid_" + productId, "qty:" + qty);
                        userProduct.setMaxAge(60 * 60 * 24 * 15);     // 15 days

                        Product product = new Product(qty, price);
                        HashMap<Integer, Product> cartProducts = null;

                        if (session.getAttribute("product") == null) {
                            cartProducts = new HashMap<Integer, Product>();
                            cartProducts.put(productId, product);
                        } else {
                            cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");

                            if (cartProducts.containsKey(productId)) {

                                Product exProduct = cartProducts.get(productId);
                                exProduct.setQty(exProduct.getQty() + qty);

                                cartProducts.replace(productId, exProduct);
                            } else {
                                cartProducts.put(productId, product);
                            }
                        }

                        session.setAttribute("product", cartProducts);
                        response.addCookie(userProduct);
                        response.sendRedirect("ecomIndex.jsp");
                    }
                %>

            </div>
        </section><!-- End Portfolio Section -->

    </main><!-- End #main -->

    <%@include file="ecomFooter.jsp" %>
