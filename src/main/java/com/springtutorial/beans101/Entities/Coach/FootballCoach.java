package com.springtutorial.beans101.Entities.Coach;

import com.springtutorial.beans101.Services.FortuneService;

/**
 * Implements {@link Coach}.
 */
public class FootballCoach implements Coach {

    // Dependency.
    private FortuneService fortuneServiceDependency;

    private String emailAddress;
    private String team;

    /**
     * Constructor, with one <u>dependency injection</u> parameter.
     *
     * @param fortuneService Dependency Injection of {@link FortuneService}.
     */
    public FootballCoach(FortuneService fortuneService) {
        System.out.println("Constructor Injection on FootballCoach: " + fortuneService.getClass().getSimpleName());
        this.fortuneServiceDependency = fortuneService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initBeanMethod() {
        System.out.println("Initializing FootballCoach");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroyBeanMethod() {
        System.out.println("Destroying FootballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Long shot practise for 1 hour.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceDependency.getFortune();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFortuneService(FortuneService fortuneServiceParam) {
        System.out.println("Setter Injection on FootballCoach: " + fortuneServiceParam.getClass().getSimpleName());
        this.fortuneServiceDependency = fortuneServiceParam;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * {@inheritDoc}
     */
    public void setEmailAddress(String emailAddress) {
        System.out.println("Setter Injection on Email Address: " + emailAddress);
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    /**
     * {@inheritDoc}
     */
    public void setTeam(String team) {
        System.out.println("Setter Injection literal value on Team: " + team);
        this.team = team;
    }

}
