package com.trungtamjava.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.UserDao;
import com.trungtamjava.dao.UserDaoImpl;
import com.trungtamjava.model.User;

@WebServlet(urlPatterns = "/admin/user/search")
public class UserSearchController extends HttpServlet {
	UserDao userDao = new UserDaoImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		if (keyword == null) {
			keyword = "";
		}
		List<User> users = userDao.search(keyword);
		// day du lieu list qua view, giong Map
		req.setAttribute("userList", users);
		req.setAttribute("key", keyword);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/views/search-user.jsp");
		dispatcher.forward(req, resp);
	}
}
