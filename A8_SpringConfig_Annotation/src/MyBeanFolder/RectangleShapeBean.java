package MyBeanFolder;

public class RectangleShapeBean 
{
	int length, breadth;
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
