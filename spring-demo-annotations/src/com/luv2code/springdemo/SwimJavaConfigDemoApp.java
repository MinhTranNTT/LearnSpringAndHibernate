package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		// read the config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from Spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Emai: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		// close
		context.close();
	}
}
