package com.example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.beans.Bean1;
import com.example.beans.Bean2;
import com.example.beans.Bean3;
import com.example.main.BeanThreeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class App {
    public static void main(String[] args) {
    	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            // Retrieve beans and use them
            String[] beanNames = context.getBeanDefinitionNames();
            System.out.println("Beans are----------------- ");
            for (String beanName : beanNames) {
                System.out.println(beanName);
            
            }
            System.out.println("Beans over------------------");
            
            Bean1 b1= (Bean1) context.getBean("beanOneID");
            Bean2 b2= (Bean2) context.getBean("bean2");
            Bean3 b3= (Bean3) context.getBean("createBeanThreeObject");
            
            
          System.out.println(b1.getBeanName1());
          System.out.println(b2.getBeanName2());
          System.out.println(b3.getBeanName3());

            
        } catch (Exception e)
    	{
            e.printStackTrace();
        }
        
        
    	
    }
}
