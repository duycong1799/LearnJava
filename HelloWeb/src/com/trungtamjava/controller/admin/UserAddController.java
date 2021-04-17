package com.trungtamjava.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.UserDao;
import com.trungtamjava.dao.UserDaoImpl;
import com.trungtamjava.model.User;

@WebServlet(urlPatterns = "/admin/user/add")
public class UserAddController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher
		= req.getRequestDispatcher("/admin/views/add-user.jsp");
		// chuyen tiep toan bo req, resp qua
		// trang login.jsp
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		///doc tung input name
		String name = req.getParameter("name");
		String username = req.getParameter("username");
		
		User user = new User();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(req.getParameter("password"));
		user.setAge(Integer.parseInt(req.getParameter("age")));
		user.setGender(req.getParameter("gender"));
		user.setRole(req.getParameter("role"));
		user.setImage(req.getParameter("image"));
		
		///LUU DATABASE
		UserDao userDao = new UserDaoImpl();
		userDao.create(user);
		
		resp.sendRedirect(req.getContextPath() + "/admin/user/search");

	}
}
