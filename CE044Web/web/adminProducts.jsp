<%-- 
    Document   : adminProducts
    Created on : 8 Apr, 2021, 9:25:22 PM
    Author     : Dishen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="ecomHeader.jsp" %>
<title>Admin Products Page</title>
<link rel="stylesheet" href="css/viewcart.css">
<style>
    .searchitm{
        margin-top: 100px;
        margin-bottom: 100px;
        width:100%;
        position: absolute;
        padding: 0px 300px;
    }
</style>
</head>
<%
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement prst = null;
%>
<%@include file="connectionDB.jsp" %>

<body>
    <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">

            <h1 class="logo"><a href="ecomDB.jsp">DM-Mart</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <a href="ecomDB.jsp" class="logo"><img src="assets/img/logo.png" alt=""></a>

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto active" href="adminProducts.jsp">Admin Product</a></li>
                    <li><a class="nav-link scrollto " href="addProducts.jsp">Add Product</a></li>
                    <li><a class="nav-link scrollto " href="eloginDB.jsp">Login</a></li>
                    <li><a class="nav-link scrollto " href="elogoutDB.jsp">Logout</a></li>
                </ul>
                <i class="bi bi-list mobile-nav-toggle"></i>
            </nav><!-- navbar -->

        </div>
    </header><!-- End Header -->

    <main id="main">
        <div class="searchitm">
            <form method="post" action="">
                Search By :&nbsp;<select name="searchby">
                    <option value="pid">Product Id</option>
                    <option value="pname">Product Name</option>
                    <option value="stock">Stock Items</option>
                    <option value="price">Price</option>
                </select>&nbsp;
                <select name="searchopt">
                    <option value=">">></option>
                    <option value="=">=</option>
                    <option value="<"><</option>
                    <option value="LIKE">LIKE</option>
                </select>&nbsp;
                <input type="text" name="searchproduct" placeholder="Search item..">&nbsp;
                <input class="btn btn-success" type="submit" name="searchbtn" value="Search">
                <input class="btn btn-dark" type="submit" name="clearbtn" value="clear">
            </form>
            <br>
        </div>

        <div class="table-content">
            <table class="styled-table center" style="margin-top:150px;">
                <thead>
                    <tr style="text-align: center">
                        <th>Product Id</th>
                        <th>Product Name</th>
                        <th>Product Stock</th>
                        <th>Product Image</th>
                        <th>Product Price</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>

                <%                    
                    String where = "1=1";
                    String searchbtn = request.getParameter("searchbtn");
                    String clearbtn = request.getParameter("clearbtn");

                    if (clearbtn != null) {
                        where = "1=1";
                    }

                    if (searchbtn != null) {
                        String searchby = (String) request.getParameter("searchby");
                        String searchopt = (String) request.getParameter("searchopt");
                        String val = (String) request.getParameter("searchproduct");

                        if (searchopt.equals("LIKE")) {
                            val = " '%" + val + "%' ";
                        }

                        where = searchby + " " + " " + searchopt + " " + val;
                    }

                    st = connection.createStatement();
                    rs = st.executeQuery("SELECT * FROM product_master WHERE " + where);

                    while (rs.next()) {
                        int pid = rs.getInt("pid");
                        String pname = rs.getString("pname");
                        int stock = rs.getInt("stock");
                        String image = rs.getString("image");
                        double price = rs.getDouble("price");

                %>
                <tbody style="text-align: center">
                    <tr>
                        <td><%=pid%></td>
                        <td><%=pname%></td>
                        <td><%=stock%></td>
                        <td><img src="<%=image%>" class="img-fluid" alt="<%=pname%>" style="width:210px; height: 260px"></td>
                        <td><%=price%></td><
                        <td>
                            <form action="adminChanges.jsp" method="get">
                                <input type="hidden" name="pid" value="<%=pid%>" />
                                <input type="hidden" name="query" value="update" />
                                <input class="btn btn-dark" type="submit" value="Update" />
                            </form>
                        </td>
                        <td>
                            <form action="" method="POST">
                                <input type="hidden" name="pid" value="<%=pid%>" />
                                <input type="hidden" name="query" value="delete" />
                                <input class="btn btn-danger" type="submit" value="Delete" />
                            </form>
                        </td>
                    </tr>
                </tbody>
                <%
                    }
                %>
            </table>
        </div>

    </main><!-- End #main -->
    <%
        if (request.getParameter("query") != null) {
            if (request.getParameter("query").equals("delete")) {
                int productId = Integer.parseInt(request.getParameter("pid"));

                String deleteQry = "DELETE FROM product_master WHERE `pid`=?";
                prst = connection.prepareStatement(deleteQry);
                prst.setInt(1, productId);
                int row = prst.executeUpdate();

                response.sendRedirect("adminProducts.jsp");
            }
        }
    %>

    <%@include file="ecomFooter.jsp" %>