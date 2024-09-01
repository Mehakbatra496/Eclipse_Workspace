package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MyBeanFolder.EmployeeBean;


public class MainClass
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app= new ClassPathXmlApplicationContext("MyResources/ApplicationContext.xml");
		
		EmployeeBean mb1= (EmployeeBean)app.getBean("empObj1");
		mb1.display();	
		EmployeeBean mb2= (EmployeeBean)app.getBean("empObj2");
		mb2.display();
	
	
	}

	
}
