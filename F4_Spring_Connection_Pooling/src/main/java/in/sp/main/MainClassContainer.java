package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

import in.sp.resources.SpringConfigFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.sql.Connection;

import javax.sql.DataSource;
public class MainClassContainer 
{
    public static void main(String[] args)  throws Exception
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
     //   DataSource dataSource = context.getBean(DataSource.class);
    	HikariDataSource hd= context.getBean(HikariDataSource.class);
        Connection con1 = hd.getConnection();
        Connection con2 = hd.getConnection();
        Connection con3 = hd.getConnection();
        Connection con4 = hd.getConnection();
        Connection con5 = hd.getConnection();
        
        
// con1.close(); // if they are closed then they will not be counted as total or active connection
//        con2.close();
        
        Connection con6 = hd.getConnection();
        Connection con7 = hd.getConnection();
        
        System.out.println(hd);

        System.out.println(hd.getHikariPoolMXBean().getTotalConnections());
        System.out.println(hd.getHikariPoolMXBean().getActiveConnections());
        System.out.println(hd.getHikariPoolMXBean().getIdleConnections());
        
    }
}


//package in.sp.main;
//
//import java.sql.Connection;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
//import in.sp.bean.ItemBean;
//import in.sp.resources.SpringConfigFile;
//import java.util.Map;
//import java.util.*;
//
//public class MainClassContainer 
//{
//    public static void main( String[] args )
//    {
//    
//    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);    	
//    	ItemBean ib= context.getBean(ItemBean.class);
//    	
//    	Map<String, Object> map= new HashMap<String , Object>();
//    	  map.put("item_name", ib.getItemname());
//    	  map.put("item_price", ib.getItemprice());    	    
//    	
//    	
//    	NamedParameterJdbcTemplate np= context.getBean(NamedParameterJdbcTemplate.class);
//	    	
//    	String sql = "INSERT INTO items (item_name, item_price) VALUES (:item_name, :item_price)";
//    	int count =np.update(sql, map);
//    		
//    	if(count==1)
//    	{
//    		System.out.print("Inserted Successfully    "+map);    	
//    	}
//    	else
//    	{
//    		System.out.print("Can not insert data ");    	
//    	}
//    	
//    }	
//}
