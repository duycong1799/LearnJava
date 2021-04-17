package com.a.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.a.dao.ProductDao;
import com.a.dao.ProductDaoImpl;
import com.a.model.CartItems;
import com.a.model.Product;

@WebServlet(urlPatterns = {"/add-to-cart"})
public class AddtoCartController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pId = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.parseInt(pId));
		
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart"); // luu cart vao gio hang
		
		if(obj == null) {
			CartItems cartItems = new CartItems();
			cartItems.setProduct(product);
			cartItems.setQuantity(1);
			cartItems.setUnitPrice(product.getPrice());
			
			// gio hang thi se co nhieu mat hang
			Map<String, CartItems> map = new HashMap<>();
			map.put(pId, cartItems); // them mat hang vao trong gio hang
			session.setAttribute("cart", map);
		} else {
			Map<String, CartItems> map = (Map<String, CartItems>) obj;
			CartItems cartItems = map.get(pId);
			
			if(cartItems == null) {
				cartItems = new CartItems();
				cartItems.setProduct(product);
				cartItems.setQuantity(1);
				cartItems.setUnitPrice(product.getPrice());
				
				map.put(pId, cartItems);
			} else {
				cartItems.setQuantity(cartItems.getQuantity() + 1);
			}
			session.setAttribute("cart", map);
		}
		resp.sendRedirect(req.getContextPath()+"/cart");
	}
	

}
