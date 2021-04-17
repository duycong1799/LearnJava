package com.trungtamjava.controller.client;

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

@WebServlet(urlPatterns = "/client/category/detail") // ?id=1
public class CategoryDetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		CategoryDao categoryDao = new CategoryDaoImpl();
		Category category = categoryDao.get(Integer.parseInt(id));

		req.setAttribute("u", category);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/views/detail-category.jsp");
		dispatcher.forward(req, resp);
	}
}
