package com.trungtamjava.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns="/hi")
@WebServlet(urlPatterns= {"/hi","/2"})
public class HelloController extends HttpServlet{
	//Phuong thuc HTTP GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello Servlet");
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		pw.println("<h1>Hello Servlet</h1>");
		pw.println("<p>Hello Servlet2</p>");
		pw.println("<p>Hello Servlet3</p>");
	}
	

}
