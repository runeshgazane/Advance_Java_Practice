package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside init of welcome servlet");
	}

	public void destroy() {
		System.out.println("Inside destroy of welcome servlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doget of welcome servlet");
		try (PrintWriter pw = response.getWriter();) {
			response.setContentType("text/html");
			pw.write("<h2>Welcome to servlet</h2>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
