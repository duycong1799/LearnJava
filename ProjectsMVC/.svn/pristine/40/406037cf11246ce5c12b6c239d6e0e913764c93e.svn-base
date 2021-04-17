package com.a.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.CategoryDao;
import com.a.dao.CategoryDaoImpl;
import com.a.dao.ProductDao;
import com.a.dao.ProductDaoImpl;
import com.a.model.Category;
import com.a.model.Product;

@WebServlet(urlPatterns = {"/admin/product/add"})
public class ProductAddController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoryDao categoryDao = new CategoryDaoImpl();
		List<Category> categories = categoryDao.search("");
		
		req.setAttribute("categories", categories);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/view/add-product.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // để không bị lỗi tiếng việt
		resp.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String categoryId = req.getParameter("categoryId");
		String description = req.getParameter("description");
		String price = req.getParameter("price");
		String note = req.getParameter("note");
		
		System.out.println(name);
		
		Product product = new Product();
		product.setName(name);
		product.setCategoryId(Integer.parseInt(categoryId));
		product.setDescription(description);
		product.setPrice(Integer.parseInt(price));
		product.setNote(note);
		
		ProductDao productDao  = new ProductDaoImpl();
		productDao.create(product);
		
		resp.sendRedirect(req.getContextPath()+"/admin/product/search");
	}
}
