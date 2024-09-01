package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import MyBeanFolder.RectangleShapeBean;
import MyResources.*;

public class MainClassContainer
{
	public static void main(String args[])
	{
		ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfigJAVA.class);
			RectangleShapeBean rec= (RectangleShapeBean)app.getBean("RecObj");
			System.out.print(rec.getArea()+ "      ");
			System.out.print(rec.getPerimeter());
			
			RectangleShapeBean rec2= (RectangleShapeBean)app.getBean("RecBean2_Method");
			System.out.println();
			System.out.println(rec2.getArea()+ "      "+rec2.getPerimeter());
				
	}
}
