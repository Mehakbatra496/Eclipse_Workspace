package com.example;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/javaloginpage2")
public class a1_LoginJavaFile extends HttpServlet
{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, 	IOException 
	 {
		 
	  PrintWriter pw= resp.getWriter();
	  resp.setContentType("text/html");
//	  resp.sendRedirect("DashboardJavaAnnotation");

	  
	  //person : Mehak
	  
	  if (!req.getParameter("email1").isEmpty() && !req.getParameter("pass1").isEmpty()) 
	  {
		  // Your code when both email1 and pass1 parameters are present and not empty
			

          // both getEmpty and !=null are necessary to check the condition mhk                  
		  	  
			  String remember1= req.getParameter("remember1");
			  // if he is ready to create his cookies 
			// no need of it,
			  req.setAttribute("message", "Verified by login.java file"); // it is global and will help to communication /pass info within servlets
			  	
			  pw.println("remember me is "+remember1);	  
			  pw.print(" ");
			  
			  //special case
			  if(remember1!=null)
			  {
				  
				  Cookie ck= new Cookie("mhk_login_status", "true_Cookie_MHk");
				  ck.setPath("/"); // Set the cookie path to root
				  resp.addCookie(ck);
//				  return;
//				  pw.print(" ");
//				  pw.println("Cookies value is "+ck.getValue());
			  }
			  
		  
			    RequestDispatcher rd1= req.getRequestDispatcher("DashboardView.html");
				rd1.include(req, resp); 
		  //must be  redirection from the login servlet to the dashboard servlet happens 			within the same request
	
	
		  } 
	  else
	  {
		  		  
		   pw.print("<h2 style='color:red'>Your details are incorrect </h2>");
//	
	       RequestDispatcher rd1= req.getRequestDispatcher("loginFile.html");
		   rd1.include(req, resp);
//		
//		  }
	 }

}
}


