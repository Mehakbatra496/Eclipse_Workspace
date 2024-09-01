package MyBeanFolder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Initilization is a callback interface and it has afterPropertiesSet() method ( an auto method)
public class RectangleShapeBean implements InitializingBean, DisposableBean
{
	private int length;
	private int breadth;	
	long area, peri;
	
	// using explicit ways
	// using afterPropertiesSet() method of InitializingBean callback interface	
	public void afterPropertiesSet()
	{
		System.out.println("Explicit way, method to initilize object is invoked here   ");
		length=22;
		breadth=33;		
	}
	
	public void destroy()
	{
		System.out.println("Explicit way, method to destroy object is invoked here   ");
		length=0;
		breadth=0;
	}
	
	public void displayResult()
	{
		area=length*breadth;
		peri=2*(length+breadth);
		System.out.println(area);
		System.out.println(peri);		
	}
}
