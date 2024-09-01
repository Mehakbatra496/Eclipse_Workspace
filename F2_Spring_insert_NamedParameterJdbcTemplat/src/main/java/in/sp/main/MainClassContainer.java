package in.sp.main;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import in.sp.bean.ItemBean;
import in.sp.resources.SpringConfigFile;
import java.util.Map;
import java.util.*;

public class MainClassContainer 
{
    public static void main( String[] args )
    {
    
    	Map<String, Object> map= new HashMap<String , Object>();
    	ItemBean ib= new ItemBean();
    	
    	map.put("item_name", ib.getItemname());
    	map.put("item_price", ib.getItemprice());    	    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);    	
    	NamedParameterJdbcTemplate np= context.getBean(NamedParameterJdbcTemplate.class);
	    String sql= "insert into items values(:item_name, :item_price)";
	    
    	int count=np.update(sql, map);
    	System.out.print(count);
    	
    	
    }	
}
