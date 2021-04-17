package com.trungtamjava.controller.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.dao.CartDao;
import com.trungtamjava.dao.CartDaoImpl;
import com.trungtamjava.dao.CartItemsDao;
import com.trungtamjava.dao.CartItemsDaoImpl;
import com.trungtamjava.model.Cart;
import com.trungtamjava.model.CartItems;
import com.trungtamjava.model.User;

@WebServlet(urlPatterns = {"/member/add-order"})
public class AddBillController extends HttpServlet {

	CartDao cartDao = new CartDaoImpl();
	CartItemsDao cartItemsDao = new CartItemsDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// doc tu session ra gio hang
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart"); // luu tam vao session
		
		if(obj != null) { // kiem tra xem co san pham trong gio hang khong
			Map<String, CartItems> map = (Map<String, CartItems>) obj;
			
			
			// tao hoa don truoc de lay duoc id bill			
			Cart cart = new Cart();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			cart.setDate(sdf.format(new Date()));
			
			// lay dang nhap member
			User buyer = (User) session.getAttribute("loginUser");
			cart.setBuyer(buyer);
			
			cartDao.create(cart);
			
			long total = 0;
			
			for(Entry<String, CartItems> entry : map.entrySet()) {
				CartItems cartItems = entry.getValue();
				
				cartItems.setCart(cart);
				cartItemsDao.create(cartItems);
				total += cartItems.getQuantity() * cartItems.getUnitPrice();
			}
			
			cart.setPriceTotal(total);
			cartDao.update(cart);
			
			session.removeAttribute("cart");
			resp.sendRedirect(req.getContextPath()+"/client/bills");
			
		} else {
			resp.sendRedirect(req.getContextPath()+"/sp/search");
		}
	}
}
