package com.springtutorial.beans101.Entities.Coach;

import com.springtutorial.beans101.Services.FortuneService;
import org.springframework.beans.factory.DisposableBean;

/**
 * Implements {@link Coach}.
 */
public class BaseballCoach implements Coach, DisposableBean {

    // Dependency.
    private FortuneService fortuneServiceDependency;

    private String emailAddress;
    private String team;

    /**
     * Constructor, with one <u>dependency injection</u> parameter.
     *
     * @param fortuneService Dependency Injection of {@link FortuneService}.
     */
    public BaseballCoach(FortuneService fortuneService) {
        System.out.println("Constructor Injection on BaseballCoach: " + fortuneService.getClass().getSimpleName());
        this.fortuneServiceDependency = fortuneService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initBeanMethod() {
        System.out.println("Initializing BaseballCoach");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroyBeanMethod() {
        System.out.println("Destroying BaseballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practise.";
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
        System.out.println("Setter Injection on BaseballCoach: " + fortuneServiceParam.getClass().getSimpleName());
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

    @Override
    public void destroy() throws Exception {
        System.out.println("Prototype scoped: Destroying BaseballCoach");
    }
}
