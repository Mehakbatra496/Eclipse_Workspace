package com.example;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.*;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/logout1")
public class Logout extends HttpServlet
		{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
			{
			  resp.setContentType("text/html");

			  // Retrieve the cookies from the request
	        Cookie[] cookies = req.getCookies();
        	PrintWriter pw= resp.getWriter();

	        // Check if cookies are present
	        if (cookies != null) // this case will run
	        {
	            for (Cookie cookie : cookies)
	            {
	                // Check if the cookie matches the one you want to remove
	                if (cookie.getName().equals("mhk_login_status"))
	                {
	                    // Set the maximum age of the cookie to 0 to remove it
	                    cookie.setMaxAge(0);
	                    // Add the cookie back to the response with the updated maximum age
	                    cookie.setPath("/"); // Set path to root to ensure removal from all paths

	                    resp.addCookie(cookie);
	                    
	                    
	                    pw.println("<h2 style='color:red'>Logout removed Cookie successfully.</h2>");
	                    // Forward the request to another servlet or HTML page
	                    RequestDispatcher rd = req.getRequestDispatcher("loginFile.html");
	                    rd.include(req, resp);
	                    return; // Exit the method after removing the cookie
	                }
	                
	            }
	        }
	        else
	        {
				pw.println("<h3>You are Logout , i did not had cookies</h3>");

	        			RequestDispatcher rd1= req.getRequestDispatcher("loginFile.html");
				   rd1.include(req, resp);
	        }
			
			}
		
		}


