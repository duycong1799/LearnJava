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

@WebServlet(urlPatterns = {"/admin/user/update"}) //?id=1
public class UserUpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		UserDao userDao = new UserDaoImpl();
		User user = userDao.get(Integer.parseInt(id));
 
		req.setAttribute("u", user);

		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/views/update-user.jsp");
		// chuyen tiep toan bo req, resp qua
		// trang login.jsp
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/// doc tung input name
		String name = req.getParameter("name");
		String username = req.getParameter("username");

		User user = new User();
		user.setId(Integer.valueOf(req.getParameter("id")));
		user.setName(name);
		user.setUsername(username);
		user.setPassword(req.getParameter("password"));
		user.setAge(Integer.parseInt(req.getParameter("age")));
		user.setGender(req.getParameter("gender"));
		user.setImage(req.getParameter("image"));
		user.setRole(req.getParameter("role"));
		/// LUU DATABASE
		UserDao userDao = new UserDaoImpl();
		userDao.update(user);

		resp.sendRedirect(req.getContextPath() + "/admin/user/search");

	}
}
