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
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            System.out.println("Database Driver not found");
            e.printStackTrace();
        }
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
//        else
        return con;
    }

    public String insert(Member member)
    {
        loadDriver(dbdriver);
        Connection con1 = getConnection();
        if (con1 == null)
        {
        

            return "Failed to establish connection"+con1;
        }
        

        String result = null;
        String sql = "INSERT INTO members (uname, uemail, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con1.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPassword());
            
//            System.out.print(member.getUname());
//            System.out.print(member.getPassword());
//            System.out.print(member.getEmail());
            
            int k= ps.executeUpdate();
            
            if (k==1)
            {
            	result= "Data entered successfully MHk";
            	return result;
            }
            
            
        } catch (SQLException e)
        {
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
