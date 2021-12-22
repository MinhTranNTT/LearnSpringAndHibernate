package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class GolfCoach implements Coach, DisposableBean {

	private FortuneService fortuneService;

	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("GolfCoach: inside method doMyStartupStuff");
	}

	// add a destroy method
	public void doMyCleanupYoYo() {
		System.out.println("GolfCoach: inside method doMyCleanupYoYo");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("GolfCoach override: inside method doMyCleanupYoYo");
	}

}
