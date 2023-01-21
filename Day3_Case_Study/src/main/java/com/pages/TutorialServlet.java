package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAL.TutorialImpl;
import com.pojo.Topic;
import com.pojo.Tutorial;

@WebServlet("/tutorial")
public class TutorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TutorialImpl tu; 
	
	public void init(ServletConfig config) throws ServletException {
		tu = new TutorialImpl();
		System.out.println("Inside init of tutorial");
	}

	
	public void destroy() {
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter();){
			HttpSession hs =request.getSession();
			List<Tutorial> tutorials = tu.getTutorialsById(Integer.parseInt(request.getParameter("topicname")));
			for(Tutorial t : tutorials) {
				hs.setAttribute("tutname",t.getName());
				pw.write("<ul><li><a href='details'>"+t.getName()+"</a></li></ul>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
