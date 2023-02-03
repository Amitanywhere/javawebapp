package com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter output = res.getWriter();
		
		String name = req.getParameter("name");
		
		output.printf("Login Successfull - Welcome - %s" , name);
	}

}
