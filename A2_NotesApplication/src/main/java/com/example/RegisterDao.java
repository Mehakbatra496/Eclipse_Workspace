package com.example;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    private String dburl = "jdbc:mysql://localhost/NotesDB";
    private String dbuname = "mehak";
    private String dbpassword = "111";
    private String dbdriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) 
    {
//        try {
////            Class.forName(dbDriver);
//        } catch (ClassNotFoundException e) {
//            System.out.println("Database Driver not found");
//            e.printStackTrace();
//        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
            System.out.println("Connection established: " + con);
        } catch (SQLException e) {
            System.out.println("Issue in establishing the connection");
            e.printStackTrace();
        }
        if(con==null)
        {
      	  System.out.print("Value is "+con);


        return con;
        }
        else
        return con;
    }

    public String insert(Member member) {
        loadDriver(dbdriver);
        Connection con1 = getConnection();
        if (con1 == null) {
        

            return "Failed to establish connection"+con1;
        }

        String sql = "INSERT INTO member (uname, password, email, phone) VALUES (?, ?, ?, ?)";
        String result = "Data Entered Successfully";
        try {
            PreparedStatement ps = con1.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getPassword());
            ps.setString(3, member.getEmail());
            ps.setNString(4, member.getPhone());
            ps.executeUpdate();
        } catch (SQLException e) {
            result = "Data Not Entered Successfully";
            e.printStackTrace();
        } finally {
            try {
                if (con1 != null) {
                    con1.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
