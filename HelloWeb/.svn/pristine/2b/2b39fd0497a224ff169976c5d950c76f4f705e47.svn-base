package com.trungtamjava.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.UserDao;
import com.trungtamjava.dao.UserDaoImpl;

@WebServlet(urlPatterns="/admin/user/delete")//?id=1
public class UserDeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		UserDao userDao = new UserDaoImpl();
		userDao.delete(Integer.parseInt(id));
		//chuyen huong
		resp.sendRedirect("/HelloWeb/admin/user/search");
	}

}
