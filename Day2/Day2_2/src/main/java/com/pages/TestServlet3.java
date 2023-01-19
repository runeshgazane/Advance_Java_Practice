package com.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet3 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doget of testservlet3");
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy of testservlet3");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside init of testservlet3");
	}

}


