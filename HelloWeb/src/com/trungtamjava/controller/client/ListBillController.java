package com.trungtamjava.controller.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.dao.CartDao;
import com.trungtamjava.dao.CartDaoImpl;
import com.trungtamjava.model.Cart;
import com.trungtamjava.model.User;

@WebServlet(urlPatterns = {"/client/bills"})
public class ListBillController extends HttpServlet {
	
	CartDao cartDao = new CartDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession();
	// lay dang nhap
		User buyer =(User) session.getAttribute("loginUser");	
		
		// tim don hang cua user dang dang nhap
		List<Cart> carts = cartDao.search(buyer.getId()) ;
		req.setAttribute("bills", carts);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/views/list_bill.jsp");
		dispatcher.forward(req, resp);
		
		
	}

}
