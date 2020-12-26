package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class SaveProduct
 */
@WebServlet("/SaveProduct")
public class SaveProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product p = new Product();
		HttpSession session = request.getSession();
		p.setName(request.getParameter("productName"));
		p.setPrice(Double.parseDouble(request.getParameter("productPrice")));
		session.setAttribute("Product", p);
		
		response.sendRedirect("displayProduct.jsp");
	}

}
