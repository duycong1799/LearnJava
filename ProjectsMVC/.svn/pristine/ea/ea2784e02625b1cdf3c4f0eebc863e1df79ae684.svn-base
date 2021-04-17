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

@WebServlet(urlPatterns = {"/admin/category/detail"}) //?id=1
public class CategoryDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		CategoryDao categoryDao = new CategoryDaoImpl();
		Category category = categoryDao.get(Integer.valueOf(id));
		
		req.setAttribute("c", category);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/admin/view/detail-category.jsp");
		requestDispatcher.forward(req, resp);
	}
}
