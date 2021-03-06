package com.trungtamjava.controller.admin;

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

@WebServlet(urlPatterns = {"/admin/product/update"}) //?id=
public class ProductUpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.valueOf(id));
		
		req.setAttribute("p", product);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/views/update-product.jsp");
		dispatcher.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		String price = req.getParameter("price");
		String note = req.getParameter("note");
		String category = req.getParameter("categoryId");
		
		System.out.println(name);
		
		Product product = new Product();
		product.setId(Integer.valueOf(req.getParameter("id")));
		product.setName(name);
		product.setDescription(description);
		product.setPrice(Integer.valueOf(req.getParameter("price")));
		product.setNote(note);
		product.setCategoryId(Integer.valueOf(req.getParameter("categoryId")));
		
		ProductDao productDao  = new ProductDaoImpl();
		productDao.update(product);
		
		resp.sendRedirect(req.getContextPath()+"/admin/product/search");
		
	}
}
