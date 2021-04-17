package com.trungtamjava.controller.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.dao.UserDao;
import com.trungtamjava.dao.UserDaoImpl;
import com.trungtamjava.model.User;



@WebServlet(urlPatterns = {"/member-login"})
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String code = req.getParameter("errCode");
		if(code != null && code.equals("100")) {
			req.setAttribute("msg", "Tai khoan hoac mat khau sai");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/views/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username"); //tao 1 bien và dung Parameter de lay du lieu trong database cot "username"
		String password = req.getParameter("password");	//tao 1 bien và dung Parameter de lay du lieu trong database cot "password"	
		System.out.println(username);//in 
		System.out.println(password);//in
		
		// tao session
		HttpSession httpSession = req.getSession();
		System.out.println("Session ID: " + httpSession.getId());
		UserDao userDao = new UserDaoImpl();
		User user = userDao.get(username);
		
		if(user != null && user.getPassword().equals(password)) {
			System.out.println("Log in Success");
			
			//luu doi tuong vao session
			httpSession.setAttribute("loginUser", user);
			// chuyen huong : server tra ve cho client mot trang web(duong dan) khac
			resp.sendRedirect(req.getContextPath()+"/client/views/index.jsp");
		} else {
			System.out.println("Fail");
			resp.sendRedirect(req.getContextPath()+"/member-login?errCode=100");
		}
	}
}
