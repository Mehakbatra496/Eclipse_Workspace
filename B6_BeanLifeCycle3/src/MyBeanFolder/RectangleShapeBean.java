package MyBeanFolder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RectangleShapeBean 
{
	private int length;
	private int breadth;	
	long area, peri;
	
	// bean initialization using @PostConstruct annotation 
	//	and @PreDestroy (jar file is needed javax.annotation-api-xxx.jar)
	@PostConstruct
	public void initilizeRectObj()
	{
		System.out.println("Custom method to initilize object is invoked here   ");
		length=20;
		breadth=30;		
	}
	
	@PreDestroy
	public void destroyRecObj()
	{
		System.out.println("Custom method to destroy object is invoked here   ");
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
