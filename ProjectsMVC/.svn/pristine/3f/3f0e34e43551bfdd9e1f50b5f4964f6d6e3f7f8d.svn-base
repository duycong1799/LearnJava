package com.a.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.a.model.User;
@WebFilter(urlPatterns = {"/admin/*"})
public class AdminFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {		
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse resp  = (HttpServletResponse) arg1;
		
		HttpSession httpSession = req.getSession();
		System.out.println("Session Id: "+ httpSession.getId());
		Object obj = httpSession.getAttribute("loginUser");
		
		
		if(obj != null) {
			User user = (User) obj;
			System.out.println(user.getUsername());
			if(user.getRole().equals("ROLE_ADMIN")) {
				// neu la admin thi cho di tiep
				arg2.doFilter(arg0, arg1);
			} else {
				resp.sendRedirect(req.getContextPath() + "/access-deny");
			}
		} else {
			// khong con login, het thoi gian
			// session cu bi xoa, mat het du lieu
			resp.sendRedirect(req.getContextPath()+"/admin-login");
			return;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
