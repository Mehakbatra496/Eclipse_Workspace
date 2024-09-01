package in.sp.resources;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
	public JdbcTemplate mhkJdbcTemplate()
	{
		JdbcTemplate jd= new JdbcTemplate();
		jd.setDataSource(mhkDataSource());
		return jd;
	}
}
