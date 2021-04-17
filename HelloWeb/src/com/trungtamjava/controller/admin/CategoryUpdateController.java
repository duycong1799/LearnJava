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

@WebServlet(urlPatterns = {"/admin/category/update"}) //?id=1
public class CategoryUpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		CategoryDao productcategoryDao = new CategoryDaoImpl();
		Category productcategory = productcategoryDao.get(Integer.parseInt(id));
 
		req.setAttribute("u", productcategory);

		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/views/update-category.jsp");
		// chuyen tiep toan bo req, resp qua
		// trang login.jsp
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/// doc tung input name
		String name = req.getParameter("name");
		String categoryname = req.getParameter("categoryname");

		Category category = new Category();
		category.setId(Integer.valueOf(req.getParameter("id")));
		category.setName(name);


		/// LUU DATABASE
		CategoryDao productcategoryDao = new CategoryDaoImpl();
		productcategoryDao.update(category);

		resp.sendRedirect(req.getContextPath() + "/admin/category/search");

	}

}
