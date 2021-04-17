package com.a.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.ProductDao;
import com.a.dao.ProductDaoImpl;
import com.a.model.Product;

@WebServlet(urlPatterns = {"/cp/search"})
public class ShowProductCategoryController extends HttpServlet {

	ProductDao productDao = new ProductDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String keyword= req.getParameter("keyword");
		if(keyword == null) {
			keyword="";
		}
		List<Product> products = productDao.search(keyword);
		req.setAttribute("key", keyword);
		req.setAttribute("listPC", products);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/view/search-productCat.jsp");
		dispatcher.forward(req, resp);
	}
}
