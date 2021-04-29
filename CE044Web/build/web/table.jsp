<%-- Document : table Created on : 4 Mar, 2021, 10:29:47 PM Author : Dishen
Makwana --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="x-ua-compatible" content="ie=edge" />
    <title>Advanced Java</title>
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png" />
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/owl.carousel.min.css" />
    <link rel="stylesheet" href="css/magnific-popup.css" />
    <link rel="stylesheet" href="css/font-awesome.min.css" />
    <link rel="stylesheet" href="css/themify-icons.css" />
    <link rel="stylesheet" href="css/nice-select.css" />
    <link rel="stylesheet" href="css/flaticon.css" />
    <link rel="stylesheet" href="css/animate.css" />
    <link rel="stylesheet" href="css/slicknav.css" />
    <link rel="stylesheet" href="css/style.css" />
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
  </head>

  <body>
    <!-- header-start -->
    <header>
      <div class="header-area">
        <div id="sticky-header" class="main-header-area bg-white">
          <div class="container-fluid p-0">
            <div
              class="row align-items-center justify-content-between no-gutters"
            >
              <div class="col-xl-2 col-lg-2">
                <div class="logo-img">
                  <a href="index.html">
                    <img src="img/footer-logo.png" alt="" />
                  </a>
                </div>
              </div>
              <div class="col-xl-8 col-lg-8">
                <div class="main-menu d-none d-lg-block">
                  <nav>
                    <ul id="navigation">
                      <li><a class="active" href="index.html">Home</a></li>
                      <li>
                        <a href="#"
                          >Assignment-1 <i class="ti-angle-down"></i
                        ></a>
                        <ul class="submenu">
                          <li><a href="login.html">Login</a></li>
                          <li><a href="table.html">Multiplication Table</a></li>
                          <li><a href="index_1.html">Ecommerce</a></li>
                          <li><a href="visitor.do">Visitors</a></li>
                        </ul>
                      </li>
                      <!-- <li><a href="#">Assignment-2 <i class="ti-angle-down"></i></a>
						<ul class="submenu">
						    <li><a href="calculator1.jsp">Calculator</a></li>
						    <li><a href="login2.jsp">Login Page</a></li>
						    <li><a href="conversion.jsp">Temperature Converter</a></li>
						    <li><a href="fieldgenerator.jsp">HTML Generator</a></li>
						    <li><a href="ecomhomepage.jsp">eCommerce</a></li>
						</ul>
					    </li>
					    <li><a href="#">Assignment-3 <i class="ti-angle-down"></i></a>
						<ul class="submenu">
						    <li><a href="dynamicLogin.jsp">Login & SignUp using JDBC</a></li>
						    <li><a href="editproducts.jsp">Edit Products</a></li>
						</ul>
					    </li> -->
                    </ul>
                  </nav>
                </div>
              </div>
              <div class="col-12">
                <div class="mobile_menu d-block d-lg-none"></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- header-end -->

    <!-- slider_area_start -->
    <div class="slider_area slider_bg_1">
      <div class="slider_text">
        <div class="container">
          <div class="position_relv">
            <div class="row">
              <div class="col-xl-8">
                <div class="title_text title_text2">
                  <h3>Multiplication <br />Table</h3>
                </div>
                <form action="table.jsp" method="post">
                  <input
                    class="form-control-sm"
                    type="number"
                    name="number"
                    placeholder="Generate Table"
                    onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Number'"
                    required
                  /><br /><br />
                  <button
                    type="submit"
                    name="submit"
                    class="genric-btn primary-border circle"
                  >
                    Submit
                  </button>
                  <button
                    type="reset"
                    name="reset"
                    class="genric-btn info-border circle"
                  >
                    Reset
                  </button>
                </form>
              </div>
            </div>
          </div>
          <div>
            <table border="1px" style="margin-top: 50px; margin-left: 50px">
              <% if (request.getParameter("number") != null) { int number =
              Integer.parseInt(request.getParameter("number")); for (int i = 1;
              i < 11; i++) { out.println("
              <tr>
                "); out.println("
                <td>
                  "); out.println(" " + number + " x " + i + " = " + number * i
                  + " "); out.println("
                </td>
                "); out.println("
              </tr>
              "); } } %>
            </table>
          </div>
        </div>
      </div>
    </div>
    <!-- slider_area_end -->

    <!--================ Blog Area end =================-->

    <!-- JS here -->
    <script src="js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="js/vendor/jquery-1.12.4.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/isotope.pkgd.min.js"></script>
    <script src="js/ajax-form.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>
    <script src="js/scrollIt.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/nice-select.min.js"></script>
    <script src="js/jquery.slicknav.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/jquery.countdown.js"></script>
    <script src="js/plugins.js"></script>

    <!--contact js-->
    <script src="js/contact.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/jquery.form.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/mail-script.js"></script>

    <script src="js/main.js"></script>
  </body>
</html>
