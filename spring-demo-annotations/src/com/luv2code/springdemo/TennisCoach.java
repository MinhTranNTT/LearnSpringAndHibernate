package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
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
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach >> inside doMyStartupStuff method");
	}
	
	/*
	@Autowired
	public void doMyCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach >> inside doMyCrazyStuff method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@PreDestroy
	public void doMyCrazyStuff() {
		System.out.println("TennisCoach >> inside doMyCrazyStuff method");
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
