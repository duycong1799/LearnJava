package com.a.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.CategoryDao;
import com.a.dao.CategoryDaoImpl;
import com.a.model.Category;
@WebServlet(urlPatterns = {"/admin/category/update"}) //?id=
public class CategoryUpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		CategoryDao categoryDao = new CategoryDaoImpl();
		Category category = categoryDao.get(Integer.valueOf(id));
		
		req.setAttribute("c", category);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/admin/view/update-category.jsp");
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		Category category = new Category();
		category.setId(Integer.valueOf(req.getParameter("id")));
		category.setName(name);
		CategoryDao categoryDao = new CategoryDaoImpl();
		categoryDao.update(category);
		resp.sendRedirect(req.getContextPath()+"/admin/category/search");
	}
}
