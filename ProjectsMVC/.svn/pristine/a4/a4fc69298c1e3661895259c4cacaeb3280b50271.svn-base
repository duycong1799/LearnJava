package com.a.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;
import com.a.model.User;

@WebServlet(urlPatterns = {"/member-login"})
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("errCode");
		if(code != null && code.equals("100")) {
			req.setAttribute("msg", "Tai khoan hoac mat khau sai");
		}
		if(code != null && code.equals("400")) {
			req.setAttribute("msg", "Tai khoan da duoc dang nhap o noi khac");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/view/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");						
		
		UserDao userDao = new UserDaoImpl();
		User user = userDao.get(username);
		
		if(user != null && user.getPassword().equals(password)) {
			System.out.println("Log in Success");
			
			if(user.getLoginCounter() < 1) {
				HttpSession session = req.getSession();
				//luu doi tuong vao session
				session.setAttribute("loginUser", user);
				// chuyen huong : server tra ve cho client mot trang web(duong dan) khac
				resp.sendRedirect(req.getContextPath()+"/cp/search");
			} else {
				System.out.println("Tai khoan nay da duoc dang nhap o noi khac");
				resp.sendRedirect(req.getContextPath()+"/member-login?errCode=400");//ok roi do. bat loi show ra giao dien la dc
			}
			
		} else {
			System.out.println("Fail");
			resp.sendRedirect(req.getContextPath()+"/member-login?errCode=100");
		}
	}
}
