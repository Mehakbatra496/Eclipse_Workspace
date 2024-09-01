package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.ResultSet;


@WebServlet("/con")
public class DatabaseConnection extends HttpServlet 

{

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/NotesDB";
    private static final String USER = "mehak";
    private static final String PASSWORD = "111";

//    public static void main(String[] args) {
        
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        PrintWriter pw = resp.getWriter();
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            pw.print(connection);

            
            if(connection!=null)
            {
            System.out.print(connection);
            pw.print("Connected Successfully");
            }
            
            // Create a statement object to execute the query
//            statement = connection.createStatement();

            // Execute a simple query
//            String query = "SELECT * FROM members"; // Replace with your actual table name
//            resultSet = statement.executeQuery(query);

            // Process the results
//            while (resultSet.next()) {
//                // Retrieve data from the result set (assuming there is a column named 'column_name')
//                String data = resultSet.getString("column_name"); // Replace 'column_name' with actual column name
//                System.out.println("Data: " + data);
//            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred while connecting to the database.");
            e.printStackTrace();
        } 
//        finally {
            // Close resources in the reverse order they were opened
//            try {
//                if (resultSet != null) resultSet.close();
//                if (statement != null) statement.close();
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        	
//        }
    }
}
