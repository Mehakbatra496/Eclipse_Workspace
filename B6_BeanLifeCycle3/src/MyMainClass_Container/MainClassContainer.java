package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MyBeanFolder.RectangleShapeBean;

public class MainClassContainer
{
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("MyResources/ApplicationContext.xml");
		RectangleShapeBean rrr=	(RectangleShapeBean) context.getBean("RecObj");
		rrr.displayResult();
//		context.registerShutdownHook();
	}
}
