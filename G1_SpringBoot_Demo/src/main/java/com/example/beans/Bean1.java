package com.example.beans;

public class Bean1 {
    private String beanName1;

    public String getBeanName1() {
        return beanName1;
    }

    public void setBeanName1(String beanName1) {
        this.beanName1 = beanName1;
    }

    public void displayBeanName1() {
        System.out.println("Bean name 1 is " + beanName1);
    }
}
