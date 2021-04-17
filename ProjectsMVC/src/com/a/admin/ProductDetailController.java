package com.a.admin;

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
@WebServlet(urlPatterns = {"/admin/product/detail"}) //?id=1
public class ProductDetailController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.valueOf(id));
		
		req.setAttribute("p", product);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/admin/view/detail-product.jsp");
		requestDispatcher.forward(req, resp);
	}

}
