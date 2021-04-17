package com.trungtamjava.controller.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.model.Product;

@WebServlet(urlPatterns="/client/product/detail")//?id=1
public class ProductDetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.parseInt(id));
		
		req.setAttribute("u", product);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/client/views/detail-product.jsp");
		dispatcher.forward(req, resp);
		
	}
}
