package com.pages;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAL.UserImpl;
import com.pojo.Users;

@WebServlet(value="/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserImpl ui;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside init of register");
		try {
			ui=new UserImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void destroy() {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Users u=new Users(name,city,email,password);
		try {
			int i=ui.insertUser(u);
			if(i>0)
				System.out.println("Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
