package com.springtutorial.beans101.entities.coach;

import com.springtutorial.beans101.services.FortuneService;

/**
 * Implements {@link Coach}.
 */
public class TrackCoach implements Coach {

    // Dependency.
    private FortuneService fortuneServiceDependency;

    private String emailAddress;
    private String team;

    /**
     * Constructor, with one <u>dependency injection</u> parameter.
     *
     * @param fortuneService Dependency Injection of {@link FortuneService}.
     */
    public TrackCoach(FortuneService fortuneService) {
        System.out.println("Constructor Injection on TrackCoach: " + fortuneService.getClass().getSimpleName());
        this.fortuneServiceDependency = fortuneService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initBeanMethod() {
        System.out.println("Initializing TrackCoach");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroyBeanMethod() {
        System.out.println("Destroying TrackCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 stadium rounds.";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneServiceDependency.getFortune();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFortuneService(FortuneService fortuneServiceParam) {
        System.out.println("Setter Injection on TrackCoach: " + fortuneServiceParam.getClass().getSimpleName());
        this.fortuneServiceDependency = fortuneServiceParam;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * {@inheritDoc}
     */
    public void setEmailAddress(String emailAddress) {
        System.out.println("Setter Injection literal value on Email Address: " + emailAddress);
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
