package MyResources;
import MyBeanFolder.*;
import org.springframework.context.annotation.*;


public class SpringConfigJAVA 
	{
		@Bean(name="RecObj") // providing bean name manually
		public RectangleShapeBean createBeanRectangle()
		{
			RectangleShapeBean rr= new RectangleShapeBean();			
			rr.setLength(22);
			rr.setBreadth(10);
			return rr;
		}
		
		// not providing bean name manually hence method name is the bean name
		public RectangleShapeBean RecBean2_Method() 
		{
			RectangleShapeBean rr= new RectangleShapeBean();			
			rr.setLength(10);
			rr.setBreadth(20);
			return rr;
		}
		
	}