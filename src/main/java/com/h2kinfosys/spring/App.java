package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args ) {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	HelloSpring helloSpring = context.getBean("hello", HelloSpring.class);
    	HelloSpring helloSpring1 = context.getBean("hello", HelloSpring.class);
    	helloSpring.getMessage();
    	helloSpring.getLanguage();
    	
    	if (helloSpring.equals(helloSpring1)) {
    		System.out.println("Objects are same");
    	}else {
    		System.out.println("Objects are different");
    	}
    	context.close();
    }
}
