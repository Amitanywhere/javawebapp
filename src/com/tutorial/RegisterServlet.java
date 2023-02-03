package com.tutorial;
import java.io.*;

//import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1l;
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter output = res.getWriter();
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		output.println(name + " " +  dob + " " + email + " " + phone);
	}
}
