package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call our new methods to call the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();
    }
}
