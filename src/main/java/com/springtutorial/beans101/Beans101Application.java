package com.springtutorial.beans101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springtutorial.beans101.Entities.Coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Beans101Application {

    private static final String STANDARD_APPLICATION_CONTEXT = "applicationContext.xml";

    public static void main(String[] args) {

        // Load the Spring Configuration File (Spring Container).
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(STANDARD_APPLICATION_CONTEXT);

        // Retrieve Bean with ID "myGoodCoach" from the Spring Container.
        Coach goodCoachA = context.getBean("myGoodCoach", Coach.class);
        Coach goodCoachB = context.getBean("myGoodCoach", Coach.class);

        // Retrieve Bean with ID "myBadCoach" from the Spring Container.
        Coach badCoachA = context.getBean("myBadCoach", Coach.class);
        Coach badCoachB = context.getBean("myBadCoach", Coach.class);

        System.out.println("----\n\n");

        // Call methods.
        System.out.println(goodCoachA.getDailyWorkout());
        System.out.println(badCoachA.getDailyWorkout());
        System.out.println(goodCoachA.getDailyFortune());
        System.out.println(badCoachA.getDailyFortune());

        // Reminder: myGoodCoach Bean has scope Singleton.
        goodCoachB.setEmailAddress("I've changed the email address on goodCoachB");
        System.out.println("GoodCoachA Email: " + goodCoachA.getEmailAddress());
        System.out.println("GoodCoachB Email: " + goodCoachB.getEmailAddress());

        // Reminder: myBadCoach Bean has scope Prototype.
        badCoachB.setEmailAddress("I've changed the email address on badCoachB");
        System.out.println("BadCoachA Email: " + badCoachA.getEmailAddress());
        System.out.println("BadCoachB Email: " + badCoachB.getEmailAddress());

        System.out.println("\n\n");

        // Check if goodCoachA and goodCoachB point at the same object.
        System.out.println("goodCoachA and goodCoachB are the same object: " + (goodCoachA == goodCoachB));
        System.out.println("badCoachA and badCoachB are the same object: " + (badCoachA == badCoachB));
        System.out.println("goodCoachA location: " + goodCoachA);
        System.out.println("goodCoachB location: " + goodCoachB);
        System.out.println("badCoachA location: " + badCoachA);
        System.out.println("badCoachB location: " + badCoachB);

        // Close the Spring Configuration File.
        System.out.println("\nClosing context\n----");
        context.close();

//        SpringApplication.run(SpringDemoApplication.class, args);
    }

}