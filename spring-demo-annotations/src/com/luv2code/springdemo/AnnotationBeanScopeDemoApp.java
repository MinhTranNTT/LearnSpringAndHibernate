package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		// read the config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method
//		System.out.println(theCoach.getDailyWorkout());
//		
//		System.out.println(theCoach.getDailyFortune());
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("TheCoach and AlphaCoach: " + result);
		
		System.out.println("\nAddress theCoach : " + theCoach);
		
		System.out.println("\nAddress thealphaCoach : " + alphaCoach);
		
		// close
		context.close();
	}
}
