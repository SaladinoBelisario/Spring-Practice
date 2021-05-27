package com.example.demo;

public class BaseballCoach implements Coach{

    //define a private variable for the dependency
    private FortuneService myFortuneService;

    //define the constructor for dependency injection
    public BaseballCoach(FortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the ball";
    }

    @Override
    public String getDailyFortune() {
        //use the fortune service
        return myFortuneService.getFortune();
    }
}
