package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import in.sp.bean.ItemBean;
import in.sp.resources.SpringConfigFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClassContainer 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        // Retrieve the list of ItemBean objects from the Spring configuration
        List<ItemBean> itemList = context.getBean("createItem", List.class);
        
        NamedParameterJdbcTemplate np = context.getBean(NamedParameterJdbcTemplate.class);
        // SQL query template for batch update
        String sql = "INSERT INTO items (item_name, item_price) VALUES (:item_name, :item_price)";
        
        // Prepare the batch update parameters
        Map<String, Object>[] batchValues = new HashMap[itemList.size()];
        
        
        for (int i = 0; i < itemList.size(); i++) 	
        {
            ItemBean item = itemList.get(i);
            Map<String, Object> map = new HashMap<>();
            map.put("item_name", item.getItemname());
            map.put("item_price", item.getItemprice());
            batchValues[i] = map;
        }
         
        // Perform the batch update
        int[] updateCounts = np.batchUpdate(sql, batchValues);
        
        // Output the result
        for (int count : updateCounts)
        {
            if (count == 1)
            {
                System.out.println("Inserted successfully.");
            } else {
                System.out.println("Failed to insert.");
            }
        }
        
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
