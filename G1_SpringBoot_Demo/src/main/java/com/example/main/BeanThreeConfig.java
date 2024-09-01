package com.example.main;

import org.springframework.context.annotation.Configuration;
import com.example.beans.Bean3;

import org.springframework.context.annotation.Bean;

@Configuration
public class BeanThreeConfig 
{	
	@Bean
	public Bean3 createBeanThreeObject()
	{
		 Bean3 b3 = new Bean3();
		 return b3;
	}
}
