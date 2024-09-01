package in.sp.resources;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sp.bean.ItemBean;
import java.util.*;
@Configuration
public class SpringConfigFile {

	@Bean
	public DriverManagerDataSource mhkDataSource()
	{
		DriverManagerDataSource dmd= new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");

		dmd.setUsername("mehak");
		dmd.setPassword("111");
		return dmd;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate mhkNamedParameeterJdbcTemplate()
	{
		NamedParameterJdbcTemplate jd= new NamedParameterJdbcTemplate(mhkDataSource());
//		jd.setDataSource(mhkDataSource()); // ..........mhk not this as it is passed in constructor
		return jd;
	}
	
	@Bean
	public List<ItemBean> createItem()
	{		
		List<ItemBean> listObj= new ArrayList<ItemBean>();
		
		ItemBean ib1= new ItemBean();
		ItemBean ib2= new ItemBean();
		ItemBean ib3= new ItemBean();
		
		ib1.setItemname("product_5_MHK");
		ib1.setItemprice(550);
		
		ib2.setItemname("product_6_MHK");
		ib2.setItemprice(550);
		
		ib3.setItemname("product_6_MHK");
		ib3.setItemprice(550);
		
		listObj.add(ib1);
		listObj.add(ib2);
		listObj.add(ib3);
		return listObj;
			
	}
}