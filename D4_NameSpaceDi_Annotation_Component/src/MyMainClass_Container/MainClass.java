package MyMainClass_Container;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MyBeanFolder.EmployeeBean;
import MyResources.SpringConfigFile;


public class MainClass
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con= new AnnotationConfigApplicationContext(SpringConfigFile.class);
			
		EmployeeBean emp=con.getBean(EmployeeBean.class);
		emp.display();
	}
	
}


