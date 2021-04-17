package com.trungtamjava.controller.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.dao.CartDao;
import com.trungtamjava.dao.CartDaoImpl;
import com.trungtamjava.dao.CartItemsDao;
import com.trungtamjava.dao.CartItemsDaoImpl;
import com.trungtamjava.model.CartItems;



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
		
		resp.sendRedirect(req.getContextPath()+"/client/bills");
		
	}

}
