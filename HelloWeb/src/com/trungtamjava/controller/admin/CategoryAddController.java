package com.trungtamjava.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.CategoryDao;
import com.trungtamjava.dao.CategoryDaoImpl;
import com.trungtamjava.model.Category;



@WebServlet(urlPatterns = {"/admin/category/add"})
public class CategoryAddController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/views/add-category.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); 
		resp.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");		
		
		Category category = new Category();
		category.setName(name);
		CategoryDao categoryDao = new CategoryDaoImpl();
		categoryDao.create(category);
						
		
		resp.sendRedirect(req.getContextPath()+"/admin/category/search");
	}
}
