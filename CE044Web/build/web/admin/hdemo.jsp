<%-- 
    Document   : hdemo
    Created on : 11 Apr, 2021, 9:38:42 PM
    Author     : Dishen
--%>

<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.vvp.web.HUtil"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Session hsession = HUtil.getSessionFactory().openSession();
            Transaction tx = hsession.beginTransaction();
            ProductMaster pm = new ProductMaster("App From Hibernet", 10, "img/test.jpg", 53.20);
            hsession.save(pm);
            int pid = 1;
            ProductMaster pm1 = (ProductMaster)hsession.get(ProductMaster.class, pid);
            pm.setStock(20);
            tx.commit();
        %>
    </body>
</html>
