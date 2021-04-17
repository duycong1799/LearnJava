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

@WebServlet(urlPatterns = {"/admin/user/detail"}) //?id=1
public class UserDetailController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UserDao userDao = new UserDaoImpl();
		User user = userDao.get(Integer.parseInt(id));
		
		req.setAttribute("u", user);
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/view/detail-user.jsp");
		dispatcher.forward(req, resp); // forward la chuyen tiep
	}

}
