package com.example;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;
import java.util.Enumeration;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class CheckCookieFirst extends HttpServlet
		{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
			{
			
			resp.setContentType("text/html");
			PrintWriter pw= resp.getWriter();
			Cookie[] cookies = req.getCookies(); 
			boolean flag=false;
			int time=0;
			
	        if (cookies != null) {		
	        //cookies will never be null as it is an array so check it by getName()
	            for (Cookie cookie : cookies) 
	            {
	                if (cookie.getName().equals("mhk_login_status")) 
	                {	                  
	                	resp.setContentType("text/html");
	                	cookie.setSecure(true);
	                	cookie.setMaxAge(10);
	                	pw.print(cookie.getSecure());
 	 	        	    pw.print("<br>");
 	 	        	    pw.print(cookie.getMaxAge());
 	 	        	    pw.print("<br>");
 	 	        	    
	                    pw.println("Cookie " + cookie.getName() + " is present in your browser");
	                    time=cookie.getMaxAge();

	                    	
	                    flag=true;
	                    break;
	                }
	            }
	        } 
//	        else
//	        {
//	        	pw.println("I dont know what cookies are");
//	        }
	        
	        if(flag==true)
	        {
	        	
	        	   pw.print("<br>");
                   pw.print("You are directly redirected as cookies were set");
                   pw.print("<br>");

                  pw.print("time is " +time);
			      RequestDispatcher rd1= req.getRequestDispatcher("DashboardJavaAnnotation");
				  rd1.include(req, resp);
	        }
	        else
	        {
//                pw.println("Previously cookies were NOT SET, You have to login first");
	        	RequestDispatcher rd1= req.getRequestDispatcher("loginFile.html");
				rd1.include(req, resp);
	        }
	        
	 }
		}
		
		


