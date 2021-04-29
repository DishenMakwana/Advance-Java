package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.vvp.web.Product;
import java.util.Map;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.vvp.web.ProductMaster;

public final class ecommerce_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!DOCTYPE html>\n");
      out.write("\t\t\t\t\t\t<html lang=\"en\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<head>\n");
      out.write("\t\t\t\t\t\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t\t\t\t\t\t<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<title>Ecommerce</title>\n");
      out.write("\t\t\t\t\t\t\t<meta content=\"\" name=\"description\">\n");
      out.write("\t\t\t\t\t\t\t<meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Favicons -->\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Google Fonts -->\n");
      out.write("\t\t\t\t\t\t\t<link\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\n");
      out.write("\t\t\t\t\t\t\t\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Vendor CSS Files -->\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Template Main CSS File -->\n");
      out.write("\t\t\t\t\t\t\t<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</head>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<body>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- ======= Header ======= -->\n");
      out.write("\t\t\t\t\t\t\t<header id=\"header\" class=\"d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 class=\"logo\"><a href=\"ecommerce.jsp\">DM-Mart</a></h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"index_1.html\" class=\"logo\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<nav id=\"navbar\" class=\"navbar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<li><a class=\"nav-link scrollto active\" href=\"index_1.html\">Home</a></li>-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"nav-link scrollto \" href=\"#portfolio\">Portfolio</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--<li><a class=\"nav-link scrollto\" href=\"#footer\">Contact</a></li>-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"nav-link scrollto\" href=\"viewcart.jsp\">View Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"nav-link scrollto\" href=\"elogin.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</nav><!-- navbar -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</header><!-- End Header -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<main id=\"main\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- ======= Portfolio Section ======= -->\n");
      out.write("\t\t\t\t\t\t\t\t<section id=\"portfolio\" class=\"portfolio\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2>Portfolio</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Check our <span>Portfolio</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--\t\t\t<p>Ut possimus qui ut temporibus culpa velit eveniet modi omnis est adipisci expedita at voluptas\n");
      out.write("\t\t\t\t\t\t    atque vitae\n");
      out.write("\t\t\t\t\t\t    autem.</p>-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12 d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul id=\"portfolio-flters\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li data-filter=\"*\" class=\"filter-active\">All</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li data-filter=\".filter-app\">App</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li data-filter=\".filter-card\">Card</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li data-filter=\".filter-web\">Web</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row portfolio-container\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 if (application.getAttribute("productMaster") !=null) { 
											    HashMap<Integer, ProductMaster>
												    storeProducts
												= (HashMap<Integer, ProductMaster>) application.getAttribute("productMaster");
													for (Map.Entry<Integer, ProductMaster> entry : storeProducts.entrySet()) {
														int key = entry.getKey();
														ProductMaster pm = entry.getValue();
														int pId = pm.getpId();
														int stock = pm.getStock();
														String productName = pm.getProductName();
														String image = pm.getImage();
														double price = pm.getPrice();
														
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(image);
      out.write("\" class=\"img-fluid\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(productName);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>$ ");
      out.print(price);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print(image);
      out.write("\" data-gallery=\"portfolioGallery\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"portfolio-lightbox preview-link\" title=\"");
      out.print(productName);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bx bx-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"portfolio-details.html\" class=\"details-link\" title=\"More Details\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bx bx-link\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Stock - ");
      out.print(stock);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"ecommerce.jsp\" method=\"get\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" name=\"qty\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(key);
      out.write("\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--<input type=\"hidden\" name=\"price\" value=\"450\" />-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"btn btn-dark\" type=\"submit\" value=\"Add to Cart\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
 } } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</section><!-- End Portfolio Section -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</main><!-- End #main -->\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- ======= Footer ======= -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<footer id=\"footer\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"footer-top bg-dark\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 footer-contact\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h3>DM-Mart</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tA108 Adam Street <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNew York, NY 535022<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tUnited States <br><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>Phone:</strong> +1 5589 55488 55<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>Email:</strong> info@example.com<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4>Useful Links</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4>Our Services</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4>Our Social Networks</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Cras fermentum odio eu feugiat lide par naso tierra videa magna derita valies</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"social-links mt-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"container py-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&copy; Copyright <strong><span>DM-Mart</span></strong>. All Rights Reserved.\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"credits\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tDesigned by <a href=\"https://github.com/DishenMakwana\">DISHEN MAKWANA</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- End Footer -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"preloader\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Vendor JS Files -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/aos/aos.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/purecounter/purecounter.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/vendor/waypoints/noframework.waypoints.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Template Main JS File -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</body>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
