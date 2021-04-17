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


@WebServlet(urlPatterns = {"/admin/user/search"})
public class UserSearchController extends HttpServlet {
	UserDao userDao = new UserDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		if(keyword == null) {
			keyword="";
		}
		List<User> users = userDao.search(keyword);					
		
		// lay du lieu list qua view, giong Map
		req.setAttribute("userList", users);
		req.setAttribute("key", keyword);// Để sau khi search vẫn giữ nguyên nội dung đã gõ( phải thêm value=${key} ở view), sau khi search xong lại đẩy lại key qua view(dong 19 search- user)
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/admin/view/search-user.jsp");
		// chuyen tiep toan bo red resp qua trang login.jsp
		
		dispatcher.forward(req, resp); // forward la chuyen tiep
	}

}
