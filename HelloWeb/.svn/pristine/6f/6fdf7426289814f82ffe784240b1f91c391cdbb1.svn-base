package com.trungtamjava.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= resp.getWriter();
		resp.setContentType("text/html");
		pw.println("<form>\r\n" + 
				"<div>\r\n" + 
				"  <label>Name:</label>\r\n" + 
				"    <input type=\"text\" name=\"yourname\" placeholder=\"Nhap ten cua ban\">\r\n" + 
				"  \r\n" + 
				"	</div>\r\n" + 
				"	\r\n" + 
				"	<div>\r\n" + 
				"		<label>Age:</label>\r\n" + 
				"		<input type\"text\" name=\"age\" placeholder=\"Nhap tuoi cua ban\">\r\n" + 
				"	\r\n" + 
				"	</div>\r\n" + 
				"	\r\n" + 
				"	<div>\r\n" + 
				"		<label>Address:</label>\r\n" + 
				"		<input type=\"text\" name=\"address\" placeholder=\"Nhap dia chi cua ban\">\r\n" + 
				"			   \r\n" + 
				"	</div>\r\n" + 
				"	\r\n" + 
				"	<div>\r\n" + 
				"			<label>Gender:</label> \r\n" + 
				"			<input type=\"radio\" name=\"gender\" value=\"M\" checked=\"\"> Nam\r\n" + 
				"			<input type=\"radio\" name=\"gender\" value=\"F\"> Nu\r\n" + 
				"			<input type=\"radio\" name=\"gender\" value=\"U\"> N/A\r\n" + 
				"   </div>\r\n" + 
				"	\r\n" + 
				"   <div>\r\n" + 
				"	   <label>Hobies:</label>\r\n" + 
				"	   <textarea name=\"note\"></textarea>\r\n" + 
				"   </div>\r\n" + 
				"	\r\n" + 
				"	<div>\r\n" + 
				"	   <label>Introduce:</label>\r\n" + 
				"	   <textarea name=\"note\"></textarea>\r\n" + 
				"   <div>\r\n" + 
				"			<label>Thanh Pho:</label>\r\n" + 
				"			<select name=\"city\">\r\n" + 
				"				<option value=\"HN\">Ha noi</option>\r\n" + 
				"				<option selected=\"\" value=\"HCM\">HCM</option>\r\n" + 
				"				<option value=\"DN\">Da Nang</option>\r\n" + 
				"			</select>\r\n" + 
				"		</div>\r\n" + 
				"	<div>\r\n" + 
				"		<label>Username:</label>\r\n" + 
				"		<input type=\"text\" name=\"username\" placeholder=\"Nhap username\">\r\n" + 
				"		\r\n" + 
				"	</div>\r\n" + 
				"		\r\n" + 
				"	<div>\r\n" + 
				"		<label>Password:</label>\r\n" + 
				"		<input type=\"password\" name=\"password\" placeholder=\"Nhap password\">\r\n" + 
				"		\r\n" + 
				"	</div>\r\n" + 
				"		\r\n" + 
				"	<div>\r\n" + 
				"			<button type=\"submit\">Dang ky</button>\r\n" + 
				"			<input type=\"submit\" value=\"Dang ky\">\r\n" + 
				"			<button type=\"button\">Button</button>\r\n" + 
				"			<button type=\"reset\">Reset</button>\r\n" + 
				"		</div>\r\n" + 
				"		</form>");		
	}

}
