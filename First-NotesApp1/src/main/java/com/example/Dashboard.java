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

@WebServlet("/DashboardJavaAnnotation")
public class Dashboard extends HttpServlet {
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);

	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			  resp.setHeader("Authorization", "token@123"); 
		String message = (String) req.getAttribute("message");
		PrintWriter pw = resp.getWriter();
		boolean isSetCookie = false;
		resp.setContentType("text/html");
//			pw.print("message is "+message);
//			pw.print("hello----------");

		
		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			// cookies will never be null as it is an array so check it by getName()
			for (Cookie cookie : cookies)
			{
				if (cookie.getName().equals("mhk_login_status")) {
					isSetCookie = true;
					break;
				}
			}
		}
		
		
//	        else
//	          {
//	        	pw.println("you did not select remember me, so cookies not set");
//	          }

//			if((message!=null))
//			{
//				pw.print("Message is "+message);
//				pw.print("Cookies are "+ isSetCookie);
//				
//			    RequestDispatcher rd= req.getRequestDispatcher("DashboardView.html");
//			    rd.include(req, resp);	            
//			    
//			}
//			else 

		if (isSetCookie == true) {
			pw.print("Cookies are set, so directly you are here..............");
			RequestDispatcher rd1 = req.getRequestDispatcher("DashboardView2.html");
			rd1.include(req, resp);
		} else {
			resp.sendRedirect("loginFile.html");
		}

	}

}

//		
//		
//		
//		
//		//extra code starts..............................................
//		
//		protected void service2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
//		{		
//			resp.setContentType("text/html");
//			PrintWriter pw= resp.getWriter();
//			Cookie[] cookies = req.getCookies(); 
//			String auth=req.getHeader("Authorization");
//			pw.print("auth is "+auth);
//			pw.print("<br>");
//
//			boolean flag=false;
//			int time=0;
//			
//	        if (cookies != null)
//	        { 		
//        //cookies will never be null as it is an array so check it by getName()
//               for (Cookie cookie : cookies) 
//               {
//                 if (cookie.getName().equals("mhk_login_status")) 
//                  {	                  
////                	resp.setContentType("text/html");
////                	cookie.setSecure(true);
////                	cookie.setMaxAge(10);
////                	pw.print(cookie.getSecure());
//// 	        	    pw.print("<br>");
//// 	        	    pw.print(cookie.getMaxAge());
//// 	        	    pw.print("<br>");
////	 	        	    
////                  pw.println("Cookie " + cookie.getName() + " is present in your browser");
////                  time=cookie.getMaxAge();
//                    flag=true;
//                    break;
//                }
//                 
//                 
//            }
//        } 
//        else
//        {
//        	pw.println("I dont know what cookies are");
//        }
//        
//	        
//        if(flag==true)
//        {
//           	   pw.print("<br>");
//               pw.print("You are directly redirected as cookies were set");
//               pw.print("<br>");
//
//              pw.print("time is " +time);
//  			
//			  resp.setContentType("text/html");
//			  pw.println("<h2>Welcome : User</h2>");
//			  
//			  pw.println("<h1>Here is Dashboard Page included........ </h1>");
//			  RequestDispatcher rd= req.getRequestDispatcher("DashboardView.html");
//			  rd.include(req, resp);
//             
////			  RequestDispatcher rd1= req.getRequestDispatcher("DashboardJavaAnnotation");
////			  rd1.include(req, resp);
//			  
//        }
//        
//        else if(auth!=null)
//    	{
//    		resp.sendRedirect("DashboardView.html");
//    	}
//        
//        else
//        {
//        	pw.println("Previously cookies were NOT SET, and also you have not looged in. \n You have to login first");
//	        RequestDispatcher rd1= req.getRequestDispatcher("loginFile.html");
//			rd1.include(req, resp);
//        	}
//        }
//	}		
//		
//		
//		
//
//
