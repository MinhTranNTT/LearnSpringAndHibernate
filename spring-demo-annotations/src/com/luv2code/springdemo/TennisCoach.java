package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach >> inside Constructor default");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand Volleyball";
	}
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach >> inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doMyCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach >> inside doMyCrazyStuff method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
