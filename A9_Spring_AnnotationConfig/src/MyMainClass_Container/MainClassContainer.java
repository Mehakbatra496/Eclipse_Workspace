package MyMainClass_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import MyBeanFolder.RectangleShapeBean;

public class MainClassContainer
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext app= new AnnotationConfigApplicationContext();
			
		app.register(RectangleShapeBean.class);
		app.refresh();
		
			RectangleShapeBean rec= (RectangleShapeBean)app.getBean("rectangleshapebean");
			System.out.print(rec.getArea()+ "      ");
			System.out.print(rec.getPerimeter());
			
			RectangleShapeBean rec2= (RectangleShapeBean)app.getBean("rectangleshapebean");
			System.out.println();
			System.out.println(rec2.getArea()+ "      "+rec2.getPerimeter());
				
	}
}