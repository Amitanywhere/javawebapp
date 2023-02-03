package com.tutorial;

import java.io.*;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1l;
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter output = res.getWriter();
		
		output.println("Welcome to first servlet");
	}
}
