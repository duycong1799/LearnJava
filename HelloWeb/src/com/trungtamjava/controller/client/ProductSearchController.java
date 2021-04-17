package com.trungtamjava.controller.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.model.Product;

@WebServlet(urlPatterns = "/sp/search")

public class ProductSearchController extends HttpServlet{
	ProductDao productDao = new ProductDaoImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		if (keyword == null) {
			keyword = "";
		}
		List<Product> product = productDao.search(keyword);
		// day du lieu list qua view, giong Map
		req.setAttribute("listPC", product);
		req.setAttribute("key", keyword);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/views/search-product.jsp");
		dispatcher.forward(req, resp);
	}

}
