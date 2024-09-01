package in.sp.resources;

import java.sql.DriverManager;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.*;

import javax.sql.DataSource;
@Configuration
public class SpringConfigFile {

	@Bean
	public DataSource createDataSourceObj()
	{
		HikariConfig dmd = new HikariConfig();
		dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmd.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");

		dmd.setUsername("mehak");
		dmd.setPassword("111");

		HikariDataSource hikariDataSource = new HikariDataSource(dmd);
		return hikariDataSource;
		
	}
	
	
	
}