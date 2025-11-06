package com.tnsif.ifet.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("loaded");
    	Mobile mobile = context.getBean("mobile", Mobile.class);
    	mobile.call();
    	mobile.data();
    }
}