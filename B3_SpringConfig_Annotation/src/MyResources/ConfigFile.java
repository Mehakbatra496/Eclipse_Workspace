package MyResources;

import MyBeanFolder.RectangleShapeBean;
//import MyBeanFolder.RectangleShapeBean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigFile
{
	@Bean
	@Scope("prototype")
	public RectangleShapeBean recObj()
	{
		RectangleShapeBean rec = new RectangleShapeBean();	
		rec.setLength(10);
		rec.setBreadth(20);
		return rec;	
	}	
}


