package in.sp.main;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class MainClassContainer 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("mhkJdbcTemplate");
    	
    	try
    	{
    		Connection con = jdbcTemplate.getDataSource().getConnection();
    		if(con != null)
    		{
    			System.out.println("success");
    		}
    		else
    		{
    			System.out.println("fail");
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}

/*
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
    	dataSource.setUsername("root");
    	dataSource.setPassword("root");
    	
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	jdbcTemplate.setDataSource(dataSource);
    	
    	//above configurations we can provide using XML or Java configuration file

*/