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
import com.a.model.Category;
@WebServlet(urlPatterns = {"/admin/category/search"})
public class CategorySearchController extends HttpServlet {

	CategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String keyword = req.getParameter("keyword");
		if(keyword == null) {
			keyword ="";
		}
		
		List<Category> category = categoryDao.search(keyword);
		req.setAttribute("categoryList", category);
		req.setAttribute("key", keyword);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/view/search-category.jsp");
		dispatcher.forward(req, resp);
	}
}
