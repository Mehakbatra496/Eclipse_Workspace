	package com.example;
	
	import jakarta.servlet.*;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.*;
	import java.io.*;
	
//	@WebServlet("/hello")
	public class HelloServlet2 extends HttpServlet 
	{
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Hello, World!</h1>");
	        out.println("<p>This is a simple servlet example using annotations.</p>");
	        out.println("</body></html>");
	    }
	    
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        String name = request.getParameter("name");
	        out.println("<html><body>");
	        out.println("<h1>Hello, World!</h1>");
	        out.println("<p>This is a simple servlet example using annotations.</p>");
	        
	        out.println("<h1>Form Submitted</h1>");
	        out.println("<p>You entered: " + name + "</p>");
	        out.println("</body></html>");
	    }
	}