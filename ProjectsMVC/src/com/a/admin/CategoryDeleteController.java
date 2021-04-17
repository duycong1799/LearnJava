package com.a.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.CategoryDao;
import com.a.dao.CategoryDaoImpl;


@WebServlet(urlPatterns = {"/admin/category/delete"}) //?id=1
public class CategoryDeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		CategoryDao categoryDao = new CategoryDaoImpl();
		categoryDao.delete(Integer.valueOf(id));
		resp.sendRedirect("/ProjectsMVC/admin/category/search");
	}

}
