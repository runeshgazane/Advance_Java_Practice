package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAL.TopicImpl;
import com.pojo.Topic;
import com.pojo.User;

@WebServlet(value="/topic", loadOnStartup = 2)
public class TopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TopicImpl ti;
	
	@Override
	public void init() throws ServletException {
		try {
			ti=new TopicImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void destroy() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter();){
			pw.write("<h2>List of topics</h2>");
			HttpSession hs=request.getSession();
			User user=(User) hs.getAttribute("user_details");
			List<Topic> topicList=ti.getAllTopics();
			for(Topic t : topicList) {
				pw.write("<input type='radio' name='t.getName()' id='t.getId()' value='t.getName()'>"+t.getName()+"<br><br>");
			}
			pw.write("<button type='submit' id='btn' name='btn' value='submit'>Show details</button>");
			response.sendRedirect("tutorial");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
