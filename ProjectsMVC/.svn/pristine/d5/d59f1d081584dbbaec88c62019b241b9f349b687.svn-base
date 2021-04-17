package com.a.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.CartDao;
import com.a.dao.CartDaoImpl;
import com.a.dao.CartItemsDao;
import com.a.dao.CartItemsDaoImpl;
import com.a.model.CartItems;

@WebServlet(urlPatterns = {"/member/bill/delete"})
public class ClientBillDeleteController extends HttpServlet {
	CartDao cartdao = new CartDaoImpl();
	CartItemsDao cartItemsDao = new CartItemsDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String billId = req.getParameter("billid");
		List<CartItems> cartItems = cartItemsDao.search(Integer.valueOf(billId));
		
		for(CartItems cartItem: cartItems) {
			cartItemsDao.delete(cartItem.getId());
		}
		
		cartdao.delete(Integer.valueOf(billId));
		
		resp.sendRedirect(req.getContextPath()+"/member/bills");
		
	}

}
