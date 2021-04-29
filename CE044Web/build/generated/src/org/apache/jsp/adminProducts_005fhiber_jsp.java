package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import com.vvp.web.ProductMaster;
import org.hibernate.Transaction;
import com.vvp.web.HUtil;
import org.hibernate.Session;

public final class adminProducts_005fhiber_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/ecomHeader.jsp");
    _jspx_dependants.add("/ecomFooter.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        \n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("        <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <!--<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">-->\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />-->\n");
      out.write("\n");
      out.write("        <!-- Style -->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css/loginstyle.css\" />-->\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"css/viewcart.css\">-->\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"css/checkout.css\" />-->\n");
      out.write("        <!-- Template Main CSS File -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Admin Products Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/viewcart.css\">\n");
      out.write("<style>\n");
      out.write("    .searchitm{\n");
      out.write("        margin-top: 100px;\n");
      out.write("        margin-bottom: 100px;\n");
      out.write("        width:100%;\n");
      out.write("        position: absolute;\n");
      out.write("        padding: 0px 300px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ======= Header ======= -->\n");
      out.write("    <header id=\"header\" class=\"d-flex align-items-center\">\n");
      out.write("        <div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("            <h1 class=\"logo\"><a href=\"ecomDB.jsp\">DM-Mart</a></h1>\n");
      out.write("            <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("            <a href=\"ecomDB.jsp\" class=\"logo\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("            <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"nav-link scrollto active\" href=\"adminProducts.jsp\">Admin Product</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto \" href=\"addProducts.jsp\">Add Product</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto \" href=\"eloginDB.jsp\">Login</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto \" href=\"elogoutDB.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("            </nav><!-- navbar -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </header><!-- End Header -->\n");
      out.write("\n");
      out.write("    <main id=\"main\">\n");
      out.write("        <div class=\"searchitm\">\n");
      out.write("            <form method=\"post\" action=\"\">\n");
      out.write("                Search By :&nbsp;<select name=\"searchby\">\n");
      out.write("                    <option value=\"pid\">Product Id</option>\n");
      out.write("                    <option value=\"pname\">Product Name</option>\n");
      out.write("                    <option value=\"stock\">Stock Items</option>\n");
      out.write("                    <option value=\"price\">Price</option>\n");
      out.write("                </select>&nbsp;\n");
      out.write("                <select name=\"searchopt\">\n");
      out.write("                    <option value=\">\">></option>\n");
      out.write("                    <option value=\"=\">=</option>\n");
      out.write("                    <option value=\"<\"><</option>\n");
      out.write("                    <option value=\"LIKE\">LIKE</option>\n");
      out.write("                </select>&nbsp;\n");
      out.write("                <input type=\"text\" name=\"searchproduct\" placeholder=\"Search item..\">&nbsp;\n");
      out.write("                <input class=\"btn btn-success\" type=\"submit\" name=\"searchbtn\" value=\"Search\">\n");
      out.write("                <input class=\"btn btn-dark\" type=\"submit\" name=\"clearbtn\" value=\"clear\">\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"table-content\">\n");
      out.write("            <table class=\"styled-table center\" style=\"margin-top:150px;\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr style=\"text-align: center\">\n");
      out.write("                        <th>Product Id</th>\n");
      out.write("                        <th>Product Name</th>\n");
      out.write("                        <th>Product Stock</th>\n");
      out.write("                        <th>Product Image</th>\n");
      out.write("                        <th>Product Price</th>\n");
      out.write("                        <th></th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                ");

                    String searchbtn = request.getParameter("searchbtn");
                    String clearbtn = request.getParameter("clearbtn");
                    
                    Session hSession = HUtil.getSessionFactory().openSession();
                    Transaction tx = hSession.beginTransaction();
                    Query q = hSession.createQuery("from ProductMaster pm");

                    String searchby = (String) request.getParameter("searchby");
                    String searchopt = (String) request.getParameter("searchopt");
                    String val = (String) request.getParameter("searchproduct");
                    
                    if (searchbtn != null) {
                        q = hSession.createQuery("from ProductMaster pm where pm." + searchby + " " + " " + searchopt + " pm." + val);
                    }
                    
                    if (clearbtn != null) {
                        q = hSession.createQuery("from ProductMaster pm");
                    }
                    
                    Iterator it = q.list().iterator();

                    while (it.hasNext()) {

                        ProductMaster databaseProduct = (ProductMaster) it.next();

                        int pid = databaseProduct.getPid();
                        String pname = databaseProduct.getPname();
                        int stock = databaseProduct.getStock();
                        String image = databaseProduct.getImage();
                        double price = databaseProduct.getPrice();

                
      out.write("\n");
      out.write("                <tbody style=\"text-align: center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(pid);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(pname);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stock);
      out.write("</td>\n");
      out.write("                        <td><img src=\"");
      out.print(image);
      out.write("\" class=\"img-fluid\" alt=\"");
      out.print(pname);
      out.write("\" style=\"width:210px; height: 260px\"></td>\n");
      out.write("                        <td>");
      out.print(price);
      out.write("</td><\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"adminChanges.jsp\" method=\"get\">\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"query\" value=\"update\" />\n");
      out.write("                                <input class=\"btn btn-dark\" type=\"submit\" value=\"Update\" />\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"\" method=\"POST\">\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"query\" value=\"delete\" />\n");
      out.write("                                <input class=\"btn btn-danger\" type=\"submit\" value=\"Delete\" />\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </main><!-- End #main -->\n");
      out.write("    ");

        if (request.getParameter("query") != null) {
            if (request.getParameter("query").equals("delete")) {
                int productId = Integer.parseInt(request.getParameter("pid"));
                
                ProductMaster pm = (ProductMaster)hSession.get(ProductMaster.class, productId);
                hSession.delete(pm);
                response.sendRedirect("adminProducts.jsp");
            }
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ======= Footer ======= -->\n");
      out.write("<!--<footer id=\"footer\">\n");
      out.write("\n");
      out.write("    <div class=\"footer-top bg-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 footer-contact\">\n");
      out.write("                    <h3 class=\"bg-dark text-white\">DM-Mart</h3>\n");
      out.write("                    <p>\n");
      out.write("                        A108 Adam Street <br>\n");
      out.write("                        New York, NY 535022<br>\n");
      out.write("                        United States <br><br>\n");
      out.write("                        <strong>Phone:</strong> +1 5589 55488 55<br>\n");
      out.write("                        <strong>Email:</strong> info@example.com<br>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("                    <h4 class=\"bg-dark text-white\">Useful Links</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("                    <h4 class=\"bg-dark text-white\">Our Services</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>\n");
      out.write("                        <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("                    <h4 class=\"bg-dark text-white\">Our Social Networks</h4>\n");
      out.write("                    <p>Cras fermentum odio eu feugiat lide par naso tierra videa magna derita valies</p>\n");
      out.write("                    <div class=\"social-links mt-3\">\n");
      out.write("                        <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container py-4\">\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            &copy; Copyright <strong><span>DM-Mart</span></strong>. All Rights Reserved.\n");
      out.write("        </div>\n");
      out.write("        <div class=\"credits\">\n");
      out.write("            Designed by <a href=\"https://github.com/DishenMakwana\">DEMO</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>-->\n");
      out.write("<!-- End Footer -->\n");
      out.write("\n");
      out.write("<div id=\"preloader\"></div>\n");
      out.write("<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i\n");
      out.write("        class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("<!-- Vendor JS Files -->\n");
      out.write("<script src=\"assets/vendor/aos/aos.js\"></script>\n");
      out.write("<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("<script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("<script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("<script src=\"assets/vendor/purecounter/purecounter.js\"></script>\n");
      out.write("<script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("<script src=\"assets/vendor/waypoints/noframework.waypoints.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Template Main JS File -->\n");
      out.write("<script src=\"assets/js/main.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/login.js\"></script>\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $('.input').focus(function () {\n");
      out.write("        $(this).parent().addClass('focus');\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
