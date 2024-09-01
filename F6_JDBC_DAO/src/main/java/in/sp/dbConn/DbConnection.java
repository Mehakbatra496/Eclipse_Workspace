package in.sp.dbConn;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection
{
	static Connection con;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc", "mehak","111");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
		
	}
}
