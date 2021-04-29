/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvp.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dishen Makwana
 */
public class Visitor extends HttpServlet {

    private int visitorCounter;

    public void init() {
	// Reset hit counter.
	visitorCounter = 0;
    }

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
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */

	    visitorCounter++;
	    HttpSession session = request.getSession();
	    out.println("<!doctype html>\n"
		    + "<html class=\"no-js\" lang=\"zxx\">\n"
		    + "\n"
		    + "    <head>\n"
		    + "	<meta charset=\"utf-8\">\n"
		    + "	<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n"
		    + "	<title>Servlet Visitor-Counter</title>\n"
		    + "	<meta name=\"description\" content=\"\">\n"
		    + "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
		    + "\n"
		    + "	<!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\n"
		    + "	<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n"
		    + "	<!-- Place favicon.ico in the root directory -->\n"
		    + "\n"
		    + "	<!-- CSS here -->\n"
		    + "	<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/nice-select.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/flaticon.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/animate.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/slicknav.css\">\n"
		    + "	<link rel=\"stylesheet\" href=\"css/style.css\">\n"
		    + "	<!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n"
		    + "    </head>\n"
		    + "\n"
		    + "    <body>\n"
		    + "	<!--[if lte IE 9]>\n"
		    + "		<p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve your experience and security.</p>\n"
		    + "	    <![endif]-->\n"
		    + "\n"
		    + "	<!-- header-start -->\n"
		    + "	<header>\n"
		    + "	    <div class=\"header-area \">\n"
		    + "		<div id=\"sticky-header\" class=\"main-header-area bg-white\">\n"
		    + "		    <div class=\"container-fluid p-0\">\n"
		    + "			<div class=\"row align-items-center justify-content-between no-gutters\">\n"
		    + "			    <div class=\"col-xl-2 col-lg-2\">\n"
		    + "				<div class=\"logo-img\">\n"
		    + "				    <a href=\"index.html\">\n"
		    + "					<img src=\"img/footer-logo.png\" alt=\"\">\n"
		    + "				    </a>\n"
		    + "				</div>\n"
		    + "			    </div>\n"
		    + "			    <div class=\"col-xl-8 col-lg-8\">\n"
		    + "				<div class=\"main-menu  d-none d-lg-block\">\n"
		    + "				    <nav>\n"
		    + "					<ul id=\"navigation\">\n"
		    + "\n"
		    + "					    <li><a class=\"active\" href=\"index.html\">Home</a></li>\n"
		    + "					    <li><a href=\"#\">Assignment-1 <i class=\"ti-angle-down\"></i></a>\n"
		    + "						<ul class=\"submenu\">\n"
		    + "						    <li><a href=\"login.html\">Login</a></li>\n"
		    + "						    <li><a href=\"table.html\">Multiplication Table</a></li>\n"
		    + "						    <li><a href=\"index_1.html\">Ecommerce</a></li>\n"
		    + "						    <li><a href=\"visitor.do\">Visitors</a></li>\n"
		    + "						</ul>\n"
		    + "					    </li>\n"
		    + "					    <!-- <li><a href=\"#\">Assignment-2 <i class=\"ti-angle-down\"></i></a>\n"
		    + "						<ul class=\"submenu\">\n"
		    + "						    <li><a href=\"calculator1.jsp\">Calculator</a></li>\n"
		    + "						    <li><a href=\"login2.jsp\">Login Page</a></li>\n"
		    + "						    <li><a href=\"conversion.jsp\">Temperature Converter</a></li>\n"
		    + "						    <li><a href=\"fieldgenerator.jsp\">HTML Generator</a></li>\n"
		    + "						    <li><a href=\"ecomhomepage.jsp\">eCommerce</a></li>\n"
		    + "						</ul>\n"
		    + "					    </li>\n"
		    + "					    <li><a href=\"#\">Assignment-3 <i class=\"ti-angle-down\"></i></a>\n"
		    + "						<ul class=\"submenu\">\n"
		    + "						    <li><a href=\"dynamicLogin.jsp\">Login & SignUp using JDBC</a></li>\n"
		    + "						    <li><a href=\"editproducts.jsp\">Edit Products</a></li>\n"
		    + "						</ul>\n"
		    + "					    </li> -->\n"
		    + "					</ul>\n"
		    + "				    </nav>\n"
		    + "				</div>\n"
		    + "			    </div>\n"
		    + "			    <div class=\"col-12\">\n"
		    + "				<div class=\"mobile_menu d-block d-lg-none\"></div>\n"
		    + "			    </div>\n"
		    + "			</div>\n"
		    + "		    </div>\n"
		    + "		</div>\n"
		    + "	    </div>\n"
		    + "	</header>\n"
		    + "	<!-- header-end -->\n"
		    + " <!-- slider_area_start -->\n"
		    + "	<div class=\"slider_area slider_bg_1\">\n"
		    + "	    <div class=\"slider_text\">\n"
		    + "		<div class=\"container\">\n"
		    + "		    <div class=\"position_relv\">\n"
		    + "			<div class=\"row\">\n"
		    + "			    <div class=\"col-xl-8\">\n"
		    + "				<div class=\"title_text title_text2 \">\n"
		    + "				    <h3>Visitors: " + visitorCounter + "</h3>\n"
		    + "				</div>\n"
		    + "			    </div>\n"
		    + "			</div>\n"
		    + "		    </div>\n"
		    + "		</div>\n"
		    + "	    </div>\n"
		    + "\n"
		    + "	</div>\n"
		    + "	<!-- slider_area_end -->\n"
		    + "\n"
		    + "    <!-- footer_start -->\n"
		    + "    <footer class=\"footer footer_bg_1\">\n"
		    + "\n"
		    + "        <div class=\"copy-right_text\">\n"
		    + "            <div class=\"container\">\n"
		    + "                <div class=\"footer_border\"></div>\n"
		    + "                <div class=\"row\">\n"
		    + "                    <div class=\"col-xl-12\">\n"
		    + "                        <p class=\"copy_right text-center\">\n"
		    + "                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n"
		    + "                            Copyright &copy;\n"
		    + "                            <script>document.write(new Date().getFullYear());</script> All rights reserved.\n"
		    + "                        </p>\n"
		    + "                    </div>\n"
		    + "                </div>\n"
		    + "            </div>\n"
		    + "        </div>\n"
		    + "\n"
		    + "    </footer>\n"
		    + "    <!-- footer_end -->\n"
		    + "\n"
		    + "    <!-- JS here -->\n"
		    + "    <script src=\"js/vendor/modernizr-3.5.0.min.js\"></script>\n"
		    + "    <script src=\"js/vendor/jquery-1.12.4.min.js\"></script>\n"
		    + "    <script src=\"js/popper.min.js\"></script>\n"
		    + "    <script src=\"js/bootstrap.min.js\"></script>\n"
		    + "    <script src=\"js/owl.carousel.min.js\"></script>\n"
		    + "    <script src=\"js/isotope.pkgd.min.js\"></script>\n"
		    + "    <script src=\"js/ajax-form.js\"></script>\n"
		    + "    <script src=\"js/waypoints.min.js\"></script>\n"
		    + "    <script src=\"js/jquery.counterup.min.js\"></script>\n"
		    + "    <script src=\"js/imagesloaded.pkgd.min.js\"></script>\n"
		    + "    <script src=\"js/scrollIt.js\"></script>\n"
		    + "    <script src=\"js/jquery.scrollUp.min.js\"></script>\n"
		    + "    <script src=\"js/wow.min.js\"></script>\n"
		    + "    <script src=\"js/nice-select.min.js\"></script>\n"
		    + "    <script src=\"js/jquery.slicknav.min.js\"></script>\n"
		    + "    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n"
		    + "    <script src=\"js/jquery.countdown.js\"></script>\n"
		    + "    <script src=\"js/plugins.js\"></script>\n"
		    + "\n"
		    + "    <!--contact js-->\n"
		    + "    <script src=\"js/contact.js\"></script>\n"
		    + "    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n"
		    + "    <script src=\"js/jquery.form.js\"></script>\n"
		    + "    <script src=\"js/jquery.validate.min.js\"></script>\n"
		    + "    <script src=\"js/mail-script.js\"></script>\n"
		    + "    <script src=\"js/main.js\"></script>\n"
		    + "\n"
		    + "</body>\n"
		    + "\n"
		    + "</html>");

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
