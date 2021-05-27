package com.example.demo;

public class TrackCoach implements Coach{
    //define a private variable for the dependency
    private FortuneService myFortuneService;

    //define the constructor for dependency injection
    public TrackCoach(FortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    //init method
    public void myStartupMethod(){
        System.out.println("TrackCoach: init method");
    }

    //destroy method
    public void myFinalizerMethod(){
        System.out.println("TrackCoach: destroy method");
    }
}
