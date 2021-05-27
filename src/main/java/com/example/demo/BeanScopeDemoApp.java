package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //Retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean comparison = (theCoach == alphaCoach);
        System.out.println("Pointing to the same object: " + comparison);
        System.out.println("Memory Location theCoach: " + theCoach);
        System.out.println("Memory Location alphaCoach: " + alphaCoach);

        //close context
        context.close();
    }
}
