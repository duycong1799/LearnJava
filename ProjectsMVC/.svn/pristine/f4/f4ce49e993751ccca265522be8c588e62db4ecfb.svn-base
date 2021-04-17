package com.a.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;
import com.a.model.User;


@WebServlet(urlPatterns = {"/admin/user/update"}) //?id=
public class UserUpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Đọc dữ liệu cũ
		String id = req.getParameter("id");
		UserDao userDao = new UserDaoImpl();
		User user = userDao.get(Integer.parseInt(id));		
		req.setAttribute("u", user);
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/view/update-user.jsp");
		// chuyen tiep toan bo red resp qua trang login.jsp
		
		dispatcher.forward(req, resp); // forward la chuyen tiep
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Update dữ liệu mới
		String name = req.getParameter("name");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String image = req.getParameter("image");
		String role = req.getParameter("role");
		
		User user = new User();
		user.setId(Integer.valueOf(req.getParameter("id")));
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setGender(gender);
		user.setAge(Integer.parseInt(age));
		user.setImage(image);
		user.setRole(role);
		
		
		UserDao userDao = new UserDaoImpl();
		userDao.update(user);
		
		resp.sendRedirect(req.getContextPath() +"/admin/user/search"); // contextpath là tên project
		
	}

}
