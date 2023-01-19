package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	private BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Just go to play around";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
