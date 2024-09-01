package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import MyBeanFolder.RectangleShapeBean;
import MyResources.*;
public class MainClassContainer
{
	public static void main(String args[])
	{
		ApplicationContext app= new AnnotationConfigApplicationContext(JavaConfigFile.class);				
		RectangleShapeBean rr= (RectangleShapeBean)app.getBean("rectangleShapeBean");
		System.out.println(rr.getPerimeter()+"  "+rr.getArea());			
	}
}