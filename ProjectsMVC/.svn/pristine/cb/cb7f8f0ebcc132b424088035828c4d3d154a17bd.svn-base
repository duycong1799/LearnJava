package com.a.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.ProductDao;
import com.a.dao.ProductDaoImpl;
import com.a.model.Product;
@WebServlet(urlPatterns = {"/cp/detail"})
public class ProductCatDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.valueOf(id));
		
		req.setAttribute("p", product);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/client/view/detailPC.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	
}
