package com.trungtamjava.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;

@WebServlet(urlPatterns="/admin/product/delete")//?id=1
public class ProductDeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		ProductDao productDao = new ProductDaoImpl();
		productDao.delete(Integer.parseInt(id));
		//chuyen huong
		resp.sendRedirect("/HelloWeb/admin/product/search");
	}
}
