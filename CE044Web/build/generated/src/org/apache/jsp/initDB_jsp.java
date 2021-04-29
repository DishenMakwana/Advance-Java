package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.vvp.web.ProductMaster;
import java.util.HashMap;

public final class initDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (application.getAttribute("productMaster") == null) {
	HashMap<Integer, ProductMaster> storeProduct = new HashMap<Integer, ProductMaster>();
	storeProduct.put(1, new ProductMaster(1, 15, "App 1", "assets/img/portfolio/portfolio-1.jpg", 450));
	storeProduct.put(2, new ProductMaster(2, 10, "App 2", "assets/img/portfolio/portfolio-2.jpg", 660));
	storeProduct.put(3, new ProductMaster(3, 5, "App 3", "assets/img/portfolio/portfolio-3.jpg", 300));
	storeProduct.put(4, new ProductMaster(4, 3, "App 4", "assets/img/portfolio/portfolio-4.jpg", 1000));
	storeProduct.put(5, new ProductMaster(5, 2, "App 5", "assets/img/portfolio/portfolio-5.jpg", 840));
	storeProduct.put(6, new ProductMaster(6, 7, "App 6", "assets/img/portfolio/portfolio-6.jpg", 710));
	storeProduct.put(7, new ProductMaster(7, 9, "App 7", "assets/img/portfolio/portfolio-7.jpg", 250));
	storeProduct.put(8, new ProductMaster(8, 12, "App 8", "assets/img/portfolio/portfolio-8.jpg", 72));
	storeProduct.put(9, new ProductMaster(9, 14, "App 9", "assets/img/portfolio/portfolio-9.jpg", 350));

	application.setAttribute("productMaster", storeProduct);
    }

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
