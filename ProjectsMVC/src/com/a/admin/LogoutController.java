package com.a.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/admin/logout"})
public class LogoutController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		// cach 1: xoa doi tuong session
		session.invalidate();
		// cach 2: xoa key trong doi tuong session
		//session.removeAttribute("loginUser");
		resp.sendRedirect(req.getContextPath()+"/admin-login");
	}
}
