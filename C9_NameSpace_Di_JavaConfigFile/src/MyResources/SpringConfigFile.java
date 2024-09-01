package MyResources;
import MyBeanFolder.Address;
import MyBeanFolder.EmployeeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
	
		@Bean
		public Address createAdd() 
		{
			Address ad= new Address(12,"YamunaNagar",135133);
			return ad;
		
		}

//	public EmployeeBean(int officeId, String name, int age, long mobile, Address add)

		@Bean("EmpId")
		public EmployeeBean creatEmp()
		{
			return new EmployeeBean(2334, "AmarJeet",33,45645645,createAdd());
		}
		
		
	
}
