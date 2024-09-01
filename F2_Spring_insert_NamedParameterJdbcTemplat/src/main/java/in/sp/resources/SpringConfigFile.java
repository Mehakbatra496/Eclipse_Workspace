package in.sp.resources;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sp.bean.ItemBean;

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
	public  ItemBean createItem()
	{
		ItemBean ib= new ItemBean();
		ib.setItemname("product4_MHK");
		ib.setItemprice(550);
		return ib;
	}
}
