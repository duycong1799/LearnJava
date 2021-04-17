package com.a.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;

@WebServlet(urlPatterns = {"/admin/user/delete"}) //?id=1
public class UserDeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UserDao userDao = new UserDaoImpl();
		userDao.delete(Integer.parseInt(id)); // valueOf là đối tượng như (class, object), parseInt là cơ bản trả về kiểu Int
		
		// chuyen huong
		resp.sendRedirect("/ProjectsMVC/admin/user/search");
	}
	
}
