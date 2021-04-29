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
public class AddCart extends HttpServlet {

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

	    HttpSession session = request.getSession();

//            http://localhost:8084/CE044Web/addtocart.do?gty=2&pid=1&price=450

	    int productId = Integer.parseInt(request.getParameter("pid"));
//	    double price = Double.parseDouble(request.getParameter("price"));	// Prise come form user end
	    int qty = Integer.parseInt(request.getParameter("qty"));

	    // Price Store at Server side
	    double priceProduct[] = {450, 660, 300, 1000, 840, 710, 250, 72, 350};
	    double price = 0.0;
	    for (int i = 0; i < priceProduct.length; i++) {
		if ((productId - 1) == i) {
		    price = priceProduct[i];
		}
	    }

	    // Add Cookie
	    Cookie cookies[] = request.getCookies();
	    Cookie userProduct = new Cookie("productid_" + productId, "qty:" + qty);
	    userProduct.setMaxAge(60 * 60 * 24 * 15);     // 15 days

	    Product product = new Product(qty, price);
	    HashMap<Integer, Product> cartProducts = null;

	    if (session.getAttribute("product") == null) {
		cartProducts = new HashMap<Integer, Product>();
		cartProducts.put(productId, product);
	    } else {
		cartProducts = (HashMap<Integer, Product>) session.getAttribute("product");

		if (cartProducts.containsKey(productId)) {

		    Product exProduct = cartProducts.get(productId);
		    exProduct.qty += qty;

		    cartProducts.replace(productId, exProduct);
		}
		else {
		    cartProducts.put(productId, product);
		}
	    }

	    session.setAttribute("product", cartProducts);
	    response.addCookie(userProduct);
	    response.sendRedirect("index_1.html");
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
