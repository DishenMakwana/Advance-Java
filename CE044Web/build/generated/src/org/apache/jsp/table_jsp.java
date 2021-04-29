package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\t<title>Advanced Java</title>\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n");
      out.write("\t<!-- Place favicon.ico in the root directory -->\n");
      out.write("\n");
      out.write("\t<!-- CSS here -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/slicknav.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\t<!--[if lte IE 9]>\n");
      out.write("\t\t<p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve your experience and security.</p>\n");
      out.write("\t    <![endif]-->\n");
      out.write("\n");
      out.write("\t<!-- header-start -->\n");
      out.write("\t<header>\n");
      out.write("\t    <div class=\"header-area \">\n");
      out.write("\t\t<div id=\"sticky-header\" class=\"main-header-area bg-white\">\n");
      out.write("\t\t    <div class=\"container-fluid p-0\">\n");
      out.write("\t\t\t<div class=\"row align-items-center justify-content-between no-gutters\">\n");
      out.write("\t\t\t    <div class=\"col-xl-2 col-lg-2\">\n");
      out.write("\t\t\t\t<div class=\"logo-img\">\n");
      out.write("\t\t\t\t    <a href=\"index.html\">\n");
      out.write("\t\t\t\t\t<img src=\"img/footer-logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t    </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t    <div class=\"col-xl-8 col-lg-8\">\n");
      out.write("\t\t\t\t<div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("\t\t\t\t    <nav>\n");
      out.write("\t\t\t\t\t<ul id=\"navigation\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t    <li><a class=\"active\" href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"#\">Assignment-1 <i class=\"ti-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"login.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"table.html\">Multiplication Table</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"index_1.html\">Ecommerce</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"visitor.do\">Visitors</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t    <!-- <li><a href=\"#\">Assignment-2 <i class=\"ti-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"calculator1.jsp\">Calculator</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"login2.jsp\">Login Page</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"conversion.jsp\">Temperature Converter</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"fieldgenerator.jsp\">HTML Generator</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"ecomhomepage.jsp\">eCommerce</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"#\">Assignment-3 <i class=\"ti-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"dynamicLogin.jsp\">Login & SignUp using JDBC</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"editproducts.jsp\">Edit Products</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t    </li> -->\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t    </nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t    <div class=\"col-12\">\n");
      out.write("\t\t\t\t<div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t    </div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- header-end -->\n");
      out.write("\n");
      out.write("\t<!-- slider_area_start -->\n");
      out.write("\t<div class=\"slider_area slider_bg_1\">\n");
      out.write("\t    <div class=\"slider_text\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t    <div class=\"position_relv\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t    <div class=\"col-xl-8\">\n");
      out.write("\t\t\t\t<div class=\"title_text title_text2 \">\n");
      out.write("\t\t\t\t    <h3>Multiplication <br>Table</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<form action=\"table.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t    <input class=\"form-control-sm\" type=\"number\" name=\"number\" placeholder=\"Generate Table\"\n");
      out.write("\t\t\t\t\t   onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Number'\"\n");
      out.write("\t\t\t\t\t   required><br><br>\n");
      out.write("\t\t\t\t    <button type=\"submit\" name=\"submit\"\n");
      out.write("\t\t\t\t\t    class=\"genric-btn primary-border circle\">Submit</button>\n");
      out.write("\t\t\t\t    <button type=\"reset\" name=\"reset\" class=\"genric-btn info-border circle\">Reset</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t    ");

				if(request.getParameter("number")!=null){
				int number = Integer.parseInt(request.getParameter("number"));
				for (int i = 1; i < 11; i++) {
				    out.println("<tr>");
				    out.println("<td>");
				    out.println("   " + number + "    x   " + i + "   =   " + number * i + "  ");
				    out.println("</td>");
				    out.println("</tr>");
				}
				}
			    
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t    </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- slider_area_end -->\n");
      out.write("\n");
      out.write("\t<!--================ Blog Area end =================-->\n");
      out.write("\n");
      out.write("\t<!-- JS here -->\n");
      out.write("\t<script src=\"js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("\t<script src=\"js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/isotope.pkgd.min.js\"></script>\n");
      out.write("\t<script src=\"js/ajax-form.js\"></script>\n");
      out.write("\t<script src=\"js/waypoints.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("\t<script src=\"js/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("\t<script src=\"js/scrollIt.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\n");
      out.write("\t<script src=\"js/nice-select.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.countdown.js\"></script>\n");
      out.write("\t<script src=\"js/plugins.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--contact js-->\n");
      out.write("\t<script src=\"js/contact.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.form.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("\t<script src=\"js/mail-script.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
