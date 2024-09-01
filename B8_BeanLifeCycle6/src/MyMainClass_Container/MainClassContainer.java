package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MyBeanFolder.Student;

public class MainClassContainer
{
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("MyResources/ApplicationContext.xml");
		Student rrr=	(Student) context.getBean("stdId");
		rrr.displayResult();
//		context.registerShutdownHook();
	}
}
