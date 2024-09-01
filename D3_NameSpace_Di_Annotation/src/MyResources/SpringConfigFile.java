package MyResources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import MyBeanFolder.Address;
import MyBeanFolder.EmployeeBean;


@Configuration
public class SpringConfigFile {
	
		@Bean
		public Address createAdd() 
		{
			Address addr = new Address(123,"Tokyo", 454);		
			
			return addr;
		
		}
		//	public EmployeeBean(int officeId, String name, int age, long mobile, Address add)

		@Bean("EmpId")
		public EmployeeBean creatEmp()
		{
			EmployeeBean emp= new EmployeeBean(123,"Rajat", 45, 34543523);
			return emp;
			//			return new EmployeeBean(2334, "AmarJeet",33,45645645,createAdd());
		}
					
}
