package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class adminChanges_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ecomHeader.jsp");
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
      out.write("<title>Admin Update Products Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/checkout.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ======= Header ======= -->\n");
      out.write("    <header id=\"header\" class=\"d-flex align-items-center\">\n");
      out.write("        <div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("            <h1 class=\"logo\"><a href=\"ecomDB.jsp\">DM-Mart</a></h1>\n");
      out.write("            <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("            <a href=\"ecomDB.jsp\" class=\"logo\"\n");
      out.write("               ><img src=\"assets/img/logo.png\" alt=\"\"\n");
      out.write("                  /></a>\n");
      out.write("\n");
      out.write("            <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"nav-link scrollto\" href=\"ecomDB.jsp\">Home</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto active\" href=\"addProducts.jsp\">Admin Page</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto\" href=\"adminProducts.jsp\">Admin Product</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto\" href=\"eloginDB.jsp\">Login</a></li>\n");
      out.write("                    <li><a class=\"nav-link scrollto\" href=\"elogoutDB.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("            </nav>\n");
      out.write("            <!-- .navbar -->\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- End Header -->\n");
      out.write("\n");
      out.write("    <main id=\"main\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"formBox\">\n");
      out.write("                    <form method=\"post\" action=\"\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <h1>Product Details</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            Connection connection = null;
                            Statement st = null;
                            ResultSet rs = null;
                            PreparedStatement prst = null;

                            Class.forName("com.mysql.jdbc.Driver");
                            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce21", "root", "");

                            int productId = Integer.parseInt(request.getParameter("pid"));
                            String query = (String) request.getParameter("query");

                            String fetchQry = "SELECT * FROM product_master WHERE pid=?";
                            prst = connection.prepareStatement(fetchQry);
                            prst.setInt(1, productId);
                            rs = prst.executeQuery();

                            while (rs.next()) {
                                int pid = rs.getInt("pid");
                                String pname = rs.getString("pname");
                                int stock = rs.getInt("stock");
                                String image = rs.getString("image");
                                double price = rs.getDouble("price");

                        
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("                                    <!--<div class=\"inputText\">Product Name</div>-->\n");
      out.write("                                    <label for=\"pname\" >Product Name</label>\n");
      out.write("                                    <input type=\"text\" name=\"pname\" class=\"input\" value=\"");
      out.print(pname);
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("                                    <!--<div class=\"inputText\">Product Stock</div>-->\n");
      out.write("                                    <label for=\"stock\" >Product Stock</label>\n");
      out.write("                                    <input type=\"number\" name=\"stock\" class=\"input\" value=\"");
      out.print(stock);
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("                                    <!--<div class=\"inputText\">Product Image</div>-->\n");
      out.write("                                    <label for=\"image\" >Product Image Path</label>\n");
      out.write("                                    <input type=\"text\" name=\"image\" class=\"input\" value=\"");
      out.print(image);
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("                                    <!--<div class=\"inputText\">Product Price</div>-->\n");
      out.write("                                    <label for=\"price\" >Product Price</label>\n");
      out.write("                                    <input type=\"number\" name=\"price\" class=\"input\" value=\"");
      out.print(price);
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <input\n");
      out.write("                                    type=\"submit\"\n");
      out.write("                                    name=\"Submit\"\n");
      out.write("                                    class=\"button\"\n");
      out.write("                                    value=\"Update Product\"\n");
      out.write("                                    />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    <!-- End #main -->\n");
      out.write("\n");
      out.write("    ");

        if (request.getParameter("pname") != null && request.getParameter("stock") != null && request.getParameter("image") != null && request.getParameter("price") != null) {

            String pname = request.getParameter("pname");
            int stock = Integer.parseInt(request.getParameter("stock"));
            String image = request.getParameter("image");
            double price = Double.parseDouble(request.getParameter("price"));
            
            String updateQry = "UPDATE `product_master` SET"
                    + "`pname`=?, `stock`=?, `image`=?, `price`=? WHERE pid=?;";
            prst = connection.prepareStatement(updateQry);
            prst.setString(1, pname);
            prst.setInt(2, stock);
            prst.setString(3, image);
            prst.setDouble(4, price);
            prst.setInt(5, productId);
            int row = st.executeUpdate(updateQry);
            
            if (row == 1) {
                response.sendRedirect("adminProducts.jsp");
            }
        }
    
      out.write('\n');
      out.write('\n');
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
