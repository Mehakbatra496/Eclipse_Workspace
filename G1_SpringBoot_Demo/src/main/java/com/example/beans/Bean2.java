package com.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {
	
    @Value("Meenakshi")
    private String beanName2;

    public String getBeanName2() {
        return beanName2;
    }

    public void setBeanName2(String beanName2) {
        this.beanName2 = beanName2;
    }

    public void displayBeanName2() {
        System.out.println("Bean name 2 is " + beanName2);
    }
}
