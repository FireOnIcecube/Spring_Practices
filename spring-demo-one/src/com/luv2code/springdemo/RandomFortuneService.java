package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	private String[] data= {
			"Good","Normal","Bad"
	} ;
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		return data[index];
		
	}
	

}
