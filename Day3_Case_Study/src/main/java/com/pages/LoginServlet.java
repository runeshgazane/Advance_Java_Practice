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
import javax.servlet.http.HttpSession;

import com.DAL.TopicImpl;
import com.DAL.UserImpl;
import com.pojo.User;
import com.util.DBUtil;

@WebServlet(value="/validate", loadOnStartup = 1)
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
		User u=new User(email,password);
		try {
			User user=ui.validateUser(u);
			if(user!=null) {
				HttpSession hs=request.getSession();
				hs.setAttribute("user_details", user);
				response.sendRedirect("topic");
			}
			else {
				pw.write("<h3>Invalid Login</h3><a href='login.html'>Retry</a>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
