package com.a.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.a.dao.CartDao;
import com.a.dao.CartDaoImpl;
import com.a.dao.CartItemsDao;
import com.a.dao.CartItemsDaoImpl;
import com.a.model.Cart;
import com.a.model.CartItems;

@WebServlet(urlPatterns = {"/member/bill-product"})
public class ClientBillDetailController extends HttpServlet {
	CartDao cartdao = new CartDaoImpl();
	CartItemsDao cartItemsDao = new CartItemsDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String billId = req.getParameter("billid");
		Cart cart = cartdao.get(Integer.valueOf(billId));
		req.setAttribute("carts", cart);
		
		List<CartItems> cartItems = cartItemsDao.search(Integer.valueOf(billId));
		req.setAttribute("cartItems", cartItems);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/client/view/bill-product.jsp");
		dispatcher.forward(req, resp);
	}
}
