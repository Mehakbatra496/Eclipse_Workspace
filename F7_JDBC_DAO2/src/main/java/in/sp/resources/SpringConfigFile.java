package in.sp.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sp.dao.StudentDaoImpl;
import in.sp.services.StudentServiceImpl;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DataSource createDataSourceObj()
	{
		DriverManagerDataSource dmDataSource = new DriverManagerDataSource();
		
		dmDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmDataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dmDataSource.setUsername("mehak");
		dmDataSource.setPassword("111");
		
		return dmDataSource;
	}
	
	@Bean
	public StudentDaoImpl createStdDaoImplObj()
	{
		StudentDaoImpl stdDaoImpl = new StudentDaoImpl();
		stdDaoImpl.setDataSource(createDataSourceObj());
		return stdDaoImpl;
	}
	
	@Bean
	public StudentServiceImpl createStdServiceImplObj()
	{
		StudentServiceImpl stdServiceImpl = new StudentServiceImpl();
		stdServiceImpl.setStdDao(createStdDaoImplObj());
		return stdServiceImpl;
	}
}