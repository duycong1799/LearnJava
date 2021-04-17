package com.trungtamjava.controller.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.model.CartItems;
import com.trungtamjava.model.Product;

@WebServlet(urlPatterns = { "/add-to-cart" })
public class AddCartItemToBillController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pId = req.getParameter("id");
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(Integer.parseInt(pId));

		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart"); // luu cart vao gio hang

		if (obj == null) {
			CartItems cartItems = new CartItems();
			cartItems.setProduct(product);
			cartItems.setQuantity(1);
			//System.out.println("aaaaaaaaaaa 1 aaa" + product.getPrice());
			cartItems.setUnitPrice(product.getPrice());
			
			//System.out.println("aaaaaaaaaaa 2 aaa" + cartItems.getUnitPrice());
			// gio hang thi se co nhieu mat hang
			Map<String, CartItems> map = new HashMap<>();
			map.put(pId, cartItems); // them mat hang vao trong gio hang
			session.setAttribute("cart", map);
			
//			float f1 = Float.parseFloat(cartItems.getUnitPrice());
//			int f2 = (int)f1+1;
//			// float amount=Float.parseFloat(strAmount)
//			req.setAttribute("total", f1 * cartItems.getQuantity());
			
		} else {
			Map<String, CartItems> map = (Map<String, CartItems>) obj;
			CartItems cartItems = map.get(pId);

			if (cartItems == null) {
				cartItems = new CartItems();
				cartItems.setProduct(product);
				cartItems.setQuantity(1);
				// System.out.println("aaaaaaaaaaa 2 aaa"+product.getPrice());
				cartItems.setUnitPrice(product.getPrice());

				map.put(pId, cartItems);
			} else {
				cartItems.setQuantity(cartItems.getQuantity() + 1);
			}
			session.setAttribute("cart", map);
		}
		resp.sendRedirect(req.getContextPath() + "/cart");
	}

}
