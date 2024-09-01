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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/javaloginpage2")
public class a1_LoginJavaFile extends HttpServlet {

    // Database connection details
	 String dburl = "jdbc:mysql://localhost/NotesDB";
     String dbuname = "mehak";
     String dbpassword = "111";
     String dbdriver = "com.mysql.cj.jdbc.Driver";


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");

        // Retrieve form parameters
        String email = req.getParameter("email1");
        String password = req.getParameter("pass1");
        String rememberMe = req.getParameter("remember1");

        
        System.out.print(email);
        System.out.print(password);
        System.out.print(rememberMe);
        
        // Verify user credentials from database
        boolean isValidUser = verifyUser(email, password);

        if (isValidUser) {
            if (rememberMe != null) {
                Cookie ck = new Cookie("mhk_login_status", "true_Cookie_MHk");
                ck.setPath("/"); // Set the cookie path to root
                resp.addCookie(ck);
            }
            
            RequestDispatcher rd1 = req.getRequestDispatcher("DashboardView2.jsp");
            rd1.include(req, resp);
        } else {
            pw.print("<h2 style='color:red'>Your details are incorrect</h2>");
            RequestDispatcher rd1 = req.getRequestDispatcher("loginFile.html");
            rd1.include(req, resp);
        }
    }

    private boolean verifyUser(String email, String password) {
        boolean isValid = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        

        try {
            // Establish connection
            Class.forName(dbdriver);

            conn = DriverManager.getConnection(dburl, dbuname, dbpassword);
            
            // Create SQL query
            String sql = "SELECT * FROM members WHERE uemail = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            System.out.println();
            System.out.println(sql);
            System.out.println();
//            SELECT * FROM members WHERE uemail = ap@gmail.com AND password = 4545

            // Execute query
            rs = pstmt.executeQuery();

            // Check if the user exists
            if (rs.next()) {
                isValid = true;
            }
            System.out.print(isValid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isValid;
    }
}
