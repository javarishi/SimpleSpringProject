package com.h2kinfosys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEditpad {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
		Editpad editpad = context.getBean(Editpad.class);
		System.out.println(editpad.toString());
		
    	context.close();

	}

}
