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

@WebServlet(urlPatterns = {"/admin/product/update"}) //?id=
public class ProductUpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.valueOf(id));
		
		req.setAttribute("updateproduct", product);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/view/update-product.jsp");
		dispatcher.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String category = req.getParameter("categoryId");
		String description = req.getParameter("description");
		String price = req.getParameter("price");
		String note = req.getParameter("note");
		
		System.out.println(name);
		
		Product product = new Product();
		product.setId(Integer.valueOf(req.getParameter("id")));
		product.setName(name);
		product.setCategoryId(Integer.valueOf(req.getParameter("categoryId")));
		product.setDescription(description);
		product.setPrice(Integer.parseInt(price));
		product.setNote(note);
		
		ProductDao productDao  = new ProductDaoImpl();
		productDao.update(product);
		
		resp.sendRedirect(req.getContextPath()+"/admin/product/search");
		
	}
}
