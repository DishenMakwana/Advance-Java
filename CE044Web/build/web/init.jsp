<%-- 
    Document   : initDB
    Created on : 4 Mar, 2021, 10:46:15 PM
    Author     : Dishen Makwana
--%>

<%@page import="com.vvp.web.ProductMaster"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
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
%>
