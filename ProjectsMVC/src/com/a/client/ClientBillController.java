package com.a.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.a.dao.CartDao;
import com.a.dao.CartDaoImpl;
import com.a.model.Cart;
import com.a.model.User;

@WebServlet(urlPatterns = {"/member/bills"})
public class ClientBillController extends HttpServlet {
	
	CartDao cartDao = new CartDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession();
	// lay dang nhap
		User buyer =(User) session.getAttribute("loginUser");	
		
		// tim don hang cua user dang dang nhap
		List<Cart> carts = cartDao.search(buyer.getId()) ;
		req.setAttribute("bills", carts);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/view/bill-list.jsp");
		dispatcher.forward(req, resp);
		
		
	}

}
