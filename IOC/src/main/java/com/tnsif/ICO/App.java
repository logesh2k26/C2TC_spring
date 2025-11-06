package com.tnsif.ICO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("loaded");
    	Mobile mobile = ((AbstractApplicationContext) context).getBean("mobile", Mobile.class);
    	mobile.call();
    	mobile.data();
    }
}