package com.a.client;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.a.model.CartItems;

@WebServlet(urlPatterns = {"/delete-from-cart"})
public class DeleteFromCartController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		
		//Gio hang co nhieu mat hang
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("cart");
		
		if(obj != null) {
			Map<String, CartItems> map = (Map<String, CartItems>) obj;
			map.remove(key);
			//update lai vao session
			session.setAttribute("cart", map);
		}
		// chuyen ve trang gio hang
		resp.sendRedirect(req.getContextPath()+"/cart");
	}
}
