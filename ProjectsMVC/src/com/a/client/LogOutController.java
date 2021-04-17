package com.a.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.a.dao.UserDao;
import com.a.dao.UserDaoImpl;
import com.a.model.User;

@WebServlet(urlPatterns = {"/client/logout"})
public class LogOutController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("loginUser");
		if(obj != null) {
			System.out.println("Destroy");
			User user = (User) obj;
			UserDao userDao = new UserDaoImpl();
			userDao.updateLoginCounter(user.getId(), user.getLoginCounter() ); // giam so luong login xuong // Nếu thêm -1 vào cũng đúng vì vào phòng thi chỉ được đăng nhập 1 lần, nếu muốn đăng nhập lại thì phải nhờ admin
		}
		
		session.invalidate();
		resp.sendRedirect(req.getContextPath()+"/member-login");
	}
}
