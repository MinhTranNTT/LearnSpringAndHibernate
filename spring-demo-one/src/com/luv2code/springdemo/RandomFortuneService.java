package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// create an array of String
	private String[] data = {
			"This is Cat",
			"This is Dog",
			"This is Duck"
	};
	
	// create a random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random String in array
		int index = random.nextInt(data.length);
		
		System.out.println("Index: " + index);
		String theFortune = data[index];
		
		return theFortune;
	}

}
