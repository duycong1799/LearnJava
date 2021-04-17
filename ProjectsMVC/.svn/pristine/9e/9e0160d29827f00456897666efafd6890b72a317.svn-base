package com.a.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;
import com.a.model.User;


@WebServlet(urlPatterns = {"/admin/user/add"})
public class UserAddController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("errCode");
		if(code != null && code.equals("101")) {
			req.setAttribute("msg", "User name da ton tai");
		}
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/view/add-user.jsp");
		// chuyen tiep toan bo red resp qua trang login.jsp
		
		dispatcher.forward(req, resp); // forward la chuyen tiep
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // để không bị lỗi tiếng việt
		resp.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String image = req.getParameter("image");
		String role = req.getParameter("role");
		
		User user = new User();
		user.setName(username);
		user.setUsername(username);
		user.setPassword(password);
		user.setGender(gender);
		user.setAge(Integer.parseInt(age));
		user.setImage(image);
		user.setRole(role);
		
		
		UserDao userDao;
		try {	
			userDao = new UserDaoImpl();
			userDao.create(user);
			userDao.get(username).equals(username);
			resp.sendRedirect("/ProjectsMVC/admin/user/search");
		} catch (Exception e) {
			System.out.println("Fail" + e);
			resp.sendRedirect(req.getContextPath()+"/admin/user/add?errorCode=101");
		}
		
		
	}

}
