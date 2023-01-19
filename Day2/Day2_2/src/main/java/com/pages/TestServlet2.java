package com.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/test2", loadOnStartup=1)
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestServlet2() {
        System.out.println("Inside ctor of testservlet2");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doget of testservlet2");
	}


	@Override
	public void destroy() {
		System.out.println("Inside destroy of testservlet2");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("Inside init of testservlet2");
	}

	
	

}
