
package com.example.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main 
{
	//starts here, 
	public static void main(String args[])
	{
		//will use resource to set the configurations (details here)
		Resource rs= new ClassPathResource("MyResources/applicationContext.xml");
		// This line will add xml file into the memory
		//ClassPathResource and simlilar others are the implemented classes
		
		BeanFactory container = new XmlBeanFactory(rs);
		// this line will read the xml file info, as beanfactory is a container
		
	//get a bean object set where were set by xml and bean class, access it and call the methods
		StudentBeanClass std=(StudentBeanClass)container.getBean("stdobj");
		//std is a getObject set by bean class and the config class
		std.display();
	}

}
