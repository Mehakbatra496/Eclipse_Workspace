package com.example.beans;

import org.springframework.beans.factory.annotation.Value;

public class Bean3
{
	@Value("Shourya")
	private String beanName3;


	public String getBeanName3() {
		return beanName3;
	}

	public void setBeanName3(String beanName3) {
		this.beanName3 = beanName3;
	}
	
	public void displayBeanName3()
	{
		System.out.print("Bean name 3 is "+beanName3);
	}

}
