package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.beans.Student;
import in.sp.dbConn.DbConnection;
import in.sp.*;

public class StudentDaoImpl implements StudentDao
{
	@Override
	public boolean addStdDetails(Student std)
	{
		boolean status = false;
		try
		{
			Connection con = DbConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into register(name, email) values(?,?)");
			ps.setString(1, std.getName());
			ps.setString(2, std.getEmail());
		
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}

}
