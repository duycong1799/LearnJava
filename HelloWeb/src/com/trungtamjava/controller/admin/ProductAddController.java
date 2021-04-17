package com.trungtamjava.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.CategoryDao;
import com.trungtamjava.dao.CategoryDaoImpl;
import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.model.Product;
import com.trungtamjava.model.Category;

@WebServlet(urlPatterns = "/admin/product/add")
public class ProductAddController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoryDao categoryDao = new CategoryDaoImpl();
		List<Category> categories = categoryDao.search("");
		
		req.setAttribute("productcategories", categories);
		RequestDispatcher dispatcher
		= req.getRequestDispatcher("/admin/views/add-product.jsp");
		// chuyen tiep toan bo req, resp qua
		// trang login.jsp
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		///doc tung input name
		String name = req.getParameter("name");
		String categoryId = req.getParameter("categoryId");
		String price = req.getParameter("price");
		
		Product product = new Product();
		product.setName(name);
		product.setDescription(req.getParameter("description"));
		product.setPrice(Integer.parseInt(price));
		product.setNote(req.getParameter("note"));
		
		Category category = new Category();
		category.setId(Integer.parseInt(categoryId));
		product.setCategory(category);
		
		///LUU DATABASE
		ProductDao productDao = new ProductDaoImpl();
		productDao.create(product);
		
		resp.sendRedirect(req.getContextPath() + "/admin/product/search");

	}
}
