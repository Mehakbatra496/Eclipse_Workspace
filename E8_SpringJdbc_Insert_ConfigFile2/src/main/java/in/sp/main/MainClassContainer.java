package in.sp.main;

F2_Spring_insert_NamedParameterJdbcTemplate
import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;

import in.sp.bean.ItemBean;
import in.sp.resources.SpringConfigFile;

public class MainClassContainer 
{
    public static void main( String[] args )
    {
    	String item_name= "Product1";
    	int item_price= 100;
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	JdbcTemplate templ = (JdbcTemplate) context.getBean("mhkJdbcTemplate");
    	
    	ItemBean ibn= context.getBean(ItemBean.class);  	
    	
    	try {
    	
    		String sql = "INSERT INTO items (item_name, item_price) VALUES (?, ?)";
	    	int count = templ.update(sql, ibn.getItemname(), ibn.getItemprice());
	    	if(count > 0)
	    	{
	    		System.out.println("Data inserted successfully");
	    	}
	    	else
	    	{
	    		System.err.println("Insertion failed");
	    	}
	    	}
	    	catch (DataAccessException e) {
	    	    System.err.println("Error occurred while inserting data: " + e.getMessage());
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