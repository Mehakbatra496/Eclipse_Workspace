package com.example;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/a") // This maps to the root of the application
public class checkCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>Debug Info</title></head><body>");
        pw.println("<h2>Debug Info:</h2>");
        
        try {
            Cookie[] cookies = req.getCookies(); 
            boolean flag = false;
            int time = 0;

            if (cookies != null) {
                pw.println("<p>Cookies found:</p>");
                for (Cookie cookie : cookies) {
                    pw.println("Cookie Name: " + cookie.getName() + "<br>");
                    if (cookie.getName().equals("mhk_login_status")) {  
                        cookie.setSecure(true);
                        cookie.setMaxAge(10);
                        pw.print("Secure: " + cookie.getSecure() + "<br>");
                        pw.print("Max Age: " + cookie.getMaxAge() + "<br>");
                        pw.println("Cookie " + cookie.getName() + " is present in your browser<br>");
                        time = cookie.getMaxAge();
                        flag = true;
                        break;
                    }
                }
            } else {
                pw.println("<p>No cookies found.</p>");
            }

            if (flag) {
                pw.print("<p>You are directly redirected as cookies were set.</p>");
                pw.print("<p>Time is " + time + "</p>");
                RequestDispatcher rd1 = req.getRequestDispatcher("DashboardJavaAnnotation2");
                rd1.forward(req, resp);
            } else {
                pw.println("<p>Previously cookies were NOT SET, You have to login first.</p>");
                RequestDispatcher rd1 = req.getRequestDispatcher("loginFile.html");
                rd1.forward(req, resp); // Change from include to forward
            }
        } catch (Exception e) {
            pw.println("<p>Error: " + e.getMessage() + "</p>");
            e.printStackTrace(pw); // Print stack trace to the response for debugging
        } finally {
            pw.println("</body></html>");
            pw.close();
        }
    }
}
