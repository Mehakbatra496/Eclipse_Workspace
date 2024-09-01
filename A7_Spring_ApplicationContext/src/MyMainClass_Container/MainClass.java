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
		System.out.print(mb1.getOfficeId()+" "+ mb1.getName()+" "+ mb1.getAge()+" "+mb1.getMobile());
		System.out.println(" ");
		EmployeeBean mb2= (EmployeeBean)app.getBean("empObj2");
		System.out.print(mb2.getOfficeId()+" "+ mb2.getName()+" "+ mb2.getAge()+" "+mb2.getMobile());
	
	
	}

}
