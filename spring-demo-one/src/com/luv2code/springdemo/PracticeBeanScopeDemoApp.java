package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());

//		Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);

		// check if they are the same
//		boolean result = (theCoach == alphaCoach);

		// print out result
//		System.out.println("\nPointing to the same object: " + result);
//
//		System.out.println("\nMemory location for theCoach: " + theCoach);
//
//		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

		// close bean
		context.close();
	}
}
