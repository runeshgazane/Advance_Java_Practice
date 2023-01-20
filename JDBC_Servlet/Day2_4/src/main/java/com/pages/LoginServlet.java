package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAL.UserImpl;
import com.pojo.Users;
import com.util.DBUtil;

@WebServlet("/validate")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserImpl ui;

	public void init(ServletConfig config) throws ServletException {
		try {
			DBUtil.getConnection();
			ui=new UserImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void destroy() {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Users u=new Users(email,password);
		try {
			String user=ui.validateUser(u);
			pw.write("<h3>Welcome "+user+"</h3>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
