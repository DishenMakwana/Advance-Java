/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvp.web;

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

/**
 *
 * @author Dishen Makwana
 */
public class ViewCart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double grandTotal = 0;

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            HttpSession session = request.getSession();
            String User = (String) session.getAttribute("User");
            HashMap<Integer, Product> cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");

            out.println("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "    <head>\n"
                    + "	<meta charset=\"utf-8\">\n"
                    + "	<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n"
                    + "\n"
                    + "	<title>Ecommerce</title>\n"
                    + "	<meta content=\"\" name=\"description\">\n"
                    + "	<meta content=\"\" name=\"keywords\">\n"
                    + "\n"
                    + "	<!-- Favicons -->\n"
                    + "	<link href=\"assets/img/favicon.png\" rel=\"icon\">\n"
                    + "	<link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n"
                    + "\n"
                    + "	<!-- Google Fonts -->\n"
                    + "	<link\n"
                    + "	    href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\n"
                    + "	    rel=\"stylesheet\">\n"
                    + "\n"
                    + "	<!-- Vendor CSS Files -->\n"
                    + "	<link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n"
                    + "	<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
                    + "	<link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n"
                    + "	<link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n"
                    + "	<link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n"
                    + "	<link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n"
                    + "\n"
                    + "	<!-- Template Main CSS File -->\n"
                    + "	<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n"
                    + " <link rel=\"stylesheet\" href=\"css/viewcart.css\">\n"
                    + "    </head>\n"
                    + "\n"
                    + "    <body>\n"
                    + "\n"
                    + "	<!-- ======= Header ======= -->\n"
                    + "	<header id=\"header\" class=\"d-flex align-items-center\">\n"
                    + "	    <div class=\"container d-flex align-items-center justify-content-between\">\n"
                    + "\n"
                    + "		<h1 class=\"logo\"><a href=\"index_1.html\">DM-Mart</a></h1>\n"
                    + "		<!-- Uncomment below if you prefer to use an image logo -->\n"
                    + "		<a href=\"index_1.html\" class=\"logo\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n"
                    + "\n"
                    + "		<nav id=\"navbar\" class=\"navbar\">\n"
                    + "		    <ul>\n"
                    + "			<li><a class=\"nav-link scrollto\" href=\"index_1.html\">Home</a></li>\n"
                    + "			<li><a class=\"nav-link scrollto active\" href=\"viewcart.do\">View Cart</a></li>\n"
                    + "			<li><a class=\"nav-link scrollto\" href=\"checkout.html\">Checkout</a></li>\n"
                    + "                 <li><a class=\"nav-link scrollto \" href=\"elogin.html\">Login</a></li>\n"
                    + "		    </ul>\n"
                    + "		    <i class=\"bi bi-list mobile-nav-toggle\"></i>\n"
                    + "		</nav><!-- .navbar -->\n"
                    + "\n"
                    + "	    </div>\n"
                    + "	</header><!-- End Header -->\n");
//	    String msg = (String) request.getParameter("msg");
//	    if (msg == "empty") {
//		out.println("<div class=\"alert alert-primary\" role=\"alert\">\n"
//			+ "  Your cart is empty, So Add Products in Cart ..! \n"
//			+ "</div>");
//	    }
            out.println("\n"
                    + "	<main id=\"main\">");

            if (cartProducts == null || cartProducts.isEmpty()) {
                out.println("<br><table class=\"styled-table center\">\n"
                        + " <thead class=\"text-justify\">\n"
                        + "        <tr>\n"
                        + " <th>Your cart is empty</th></tr></thead></table>");
//		out.println("<tr><th><p style='align:right'>Checkout (0)</p></th></tr></thead></table>");
            } else {
//		out.println("<p style='align:right'><a href='checkout.html'>Checkout (" + cartProducts.size() + ")</a></p>");
                out.println("<br><h1 align=\"center\">Hey " + (User == null ? "" : User) + ", Welcome to DM-Mart's Shopping Cart</h1>");
                out.println("<br><table class=\"styled-table center\">\n"
                        + "<thead align=\"center\">\n"
                        + "        <tr>\n"
                        + "            <th>ProductId</th>\n"
                        + "            <th>Price</th>\n"
                        + "            <th>Quantity</th>\n"
                        + "            <th>Total Price</th>\n"
                        + "            <th><a href=\"editProduct.jsp\"><button class=\"btn btn-primary\">Edit</button></a></th>"
                        + "        </tr>\n"
                        + "    </thead>");

                for (Map.Entry<Integer, Product> entry : cartProducts.entrySet()) {
                    int key = entry.getKey();
                    Product p = entry.getValue();

                    out.println("<tbody align=\"center\">\n"
                            + "        <tr>");
                    out.println("<td>" + key + "</td>");
                    out.println("<td>" + p.price + "</td>");
                    out.println("<td>" + p.qty + "</td>");
                    out.println("<td>" + (p.price * p.qty) + "</td>");
//                    out.println("<td><form action=\"editProduct.do\" method=\"post\">\n"
//                            + "      <input type=\"hidden\" name=\"editProductId\" value=\"" + key + "\" />\n"
//                            + "      <input class=\"btn btn-success\" type=\"submit\" value=\"Edit\" />\n"
//                            + "    </form></td>");
                    out.println("<td>"
                            + "<form action=\"deleteProduct.do\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"deleteProductId\" value=\"" + key + "\"/>"
                            + "<input class=\"btn btn-danger\" type=\"submit\" value=\"Delete\" />"
                            + "</form></td>");

                    grandTotal += (p.price * p.qty);
                }
                out.println("<tr><td colspan=4 class=\"active-row\">Grand Total </td><td>" + grandTotal + "</td></tr>\n"
                        + "</tr>\n"
                        + "    </tbody>\n"
                        + "</table>\n"
                        + "<div class=\"text-center mb-3\">\n"
                        + "    <a href=\"index_1.html\"><button class=\"btn btn-primary btn-block\">Continue Shopping ..</button></a>\n"
                        + "    <a href=\"checkout.html\"><button class=\"btn btn-primary btn-block\">Proceed To Checkout ..</button></a>\n"
                        + "	   </div>\n");
            }

            out.println("</main><!-- End #main -->\n"
                    + "\n"
                    + "	<!-- ======= Footer ======= -->\n"
                    + "	<footer id=\"footer\">\n"
                    + "\n"
                    + "	    <div class=\"footer-top bg-dark\">\n"
                    + "		<div class=\"container\">\n"
                    + "		    <div class=\"row\">\n"
                    + "\n"
                    + "			<div class=\"col-lg-3 col-md-6 footer-contact\">\n"
                    + "			    <h3>DM-Mart</h3>\n"
                    + "			    <p>\n"
                    + "				A108 Adam Street <br>\n"
                    + "				New York, NY 535022<br>\n"
                    + "				United States <br><br>\n"
                    + "				<strong>Phone:</strong> +1 5589 55488 55<br>\n"
                    + "				<strong>Email:</strong> info@example.com<br>\n"
                    + "			    </p>\n"
                    + "			</div>\n"
                    + "\n"
                    + "			<div class=\"col-lg-3 col-md-6 footer-links\">\n"
                    + "			    <h4>Useful Links</h4>\n"
                    + "			    <ul>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>\n"
                    + "			    </ul>\n"
                    + "			</div>\n"
                    + "\n"
                    + "			<div class=\"col-lg-3 col-md-6 footer-links\">\n"
                    + "			    <h4>Our Services</h4>\n"
                    + "			    <ul>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>\n"
                    + "				<li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>\n"
                    + "			    </ul>\n"
                    + "			</div>\n"
                    + "\n"
                    + "			<div class=\"col-lg-3 col-md-6 footer-links\">\n"
                    + "			    <h4>Our Social Networks</h4>\n"
                    + "			    <p>Cras fermentum odio eu feugiat lide par naso tierra videa magna derita valies</p>\n"
                    + "			    <div class=\"social-links mt-3\">\n"
                    + "				<a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\n"
                    + "				<a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\n"
                    + "				<a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\n"
                    + "				<a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\n"
                    + "				<a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\n"
                    + "			    </div>\n"
                    + "			</div>\n"
                    + "\n"
                    + "		    </div>\n"
                    + "		</div>\n"
                    + "	    </div>\n"
                    + "\n"
                    + "	    <div class=\"container py-4\">\n"
                    + "		<div class=\"copyright\">\n"
                    + "		    &copy; Copyright <strong><span>DM-Mart</span></strong>. All Rights Reserved.\n"
                    + "		</div>\n"
                    + "		<div class=\"credits\">\n"
                    + "		    Designed by <a href=\"https://github.com/DishenMakwana\">DISHEN MAKWANA</a>\n"
                    + "		</div>\n"
                    + "	    </div>\n"
                    + "	</footer><!-- End Footer -->\n"
                    + "\n"
                    + "	<div id=\"preloader\"></div>\n"
                    + "	<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i\n"
                    + "		class=\"bi bi-arrow-up-short\"></i></a>\n"
                    + "\n"
                    + "	<!-- Vendor JS Files -->\n"
                    + "	<script src=\"assets/vendor/aos/aos.js\"></script>\n"
                    + "	<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n"
                    + "	<script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n"
                    + "	<script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n"
                    + "	<script src=\"assets/vendor/php-email-form/validate.js\"></script>\n"
                    + "	<script src=\"assets/vendor/purecounter/purecounter.js\"></script>\n"
                    + "	<script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n"
                    + "	<script src=\"assets/vendor/waypoints/noframework.waypoints.js\"></script>\n"
                    + "\n"
                    + "	<!-- Template Main JS File -->\n"
                    + "	<script src=\"assets/js/main.js\"></script>\n"
                    + "\n"
                    + "    </body>\n"
                    + "\n"
                    + "</html>");

            // Display Cookie
            Cookie products[] = request.getCookies();
            for (Cookie c : products) {
                if (c.getName().startsWith("productid")) {
                    out.println("ProudctId : " + c.getName() + "&nbsp");
                    out.println("Qty : " + c.getValue());
                    out.println("<br>");
                }
            }
            out.println("<br><br>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
