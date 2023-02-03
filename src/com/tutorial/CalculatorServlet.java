package com.tutorial;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;

public class CalculatorServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		
		PrintWriter output = res.getWriter();
		
		String operator = req.getParameter("op");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = 0;
		if(operator.equalsIgnoreCase("add")) {
			result = num1 + num2;
		}
		else if(operator.equalsIgnoreCase("sub")) {
			result = num1 - num2;
		}
		
		else if(operator.equalsIgnoreCase("mult")) {
			result = num1 * num2;
		}
		
		else if(operator.equalsIgnoreCase("div")) {
			result = num1 / num2;
		}
		else {
			output.println("Select valid operator");
			RequestDispatcher rd = req.getRequestDispatcher("calculator.html");
			rd.include(req, res);
		}
		
		output.printf("%d %s %d = %d" , num1 , operator , num2 , result);
	}

}
