package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		
		// read the config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// call method
		System.out.println(theCoach.getDailyWorkout());
		
		// close
		context.close();
	}
}
