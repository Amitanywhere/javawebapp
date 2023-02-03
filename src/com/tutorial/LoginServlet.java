package com.tutorial;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter output = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		
		if(email.equals("admin123@xyz.in") && password.equals("admin1234")) {
			
			RequestDispatcher welcomeDispatch = req.getRequestDispatcher("welcome");
			welcomeDispatch.forward(req, res);
		}
		else {
			output.println("email or password is incorrect");
			RequestDispatcher loginDispatch = req.getRequestDispatcher("/login.html");
			loginDispatch.include(req, res);
		}
	}

}
