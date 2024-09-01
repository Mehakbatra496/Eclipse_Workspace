package MyBeanFolder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rectangleshapebean")
public class RectangleShapeBean 
{
	@Value("33")
	private int length;
	
	@Value("10")
	private int breadth;
	
	long area, peri;
	
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public long getPerimeter() 
	{
		peri= 2*(length+breadth);
		return peri;
	}
	
	public long getArea() 
	{
		area= length*breadth;
		return area;
	}
	
}
