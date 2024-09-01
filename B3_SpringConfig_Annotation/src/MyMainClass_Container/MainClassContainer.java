package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import MyBeanFolder.RectangleShapeBean;
import MyResources.*;

public class MainClassContainer
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext app= new AnnotationConfigApplicationContext();
			
		app.register(ConfigFile.class);//multiple classed can be passed here by inserting ,.
		app.refresh();
		
		RectangleShapeBean rec= (RectangleShapeBean)app.getBean("recObj");
//		System.out.print(rec.getArea()+ "      ");
//		System.out.print(rec.getPerimeter());
		System.out.println(rec);
		
		RectangleShapeBean rec2= (RectangleShapeBean)app.getBean("recObj");
		System.out.println(rec2);
//		System.out.println(rec2.getArea()+ "      "+rec2.getPerimeter());
				
	}
}