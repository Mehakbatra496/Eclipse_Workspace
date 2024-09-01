import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/con")
public class DatabaseConnection extends HttpServlet {
    private static final String URL = "jdbc:mysql://localhost:3306/NotesDB";
    private static final String USER = "mehak";
    private static final String PASSWORD = "111";

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getConnection(req, resp);
    }

    public static Connection getConnection(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            if (connection != null) {
                PrintWriter pw = resp.getWriter();
                pw.print("Connected Successfully");
            }

        } catch (ClassNotFoundException e) {
            PrintWriter pw = resp.getWriter();
            pw.print("Database Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {
            PrintWriter pw = resp.getWriter();
            pw.print("Issue in establishing the connection");
            e.printStackTrace();
        }
        return connection;
    }
}
