package com.springtutorial.beans101.entities.coach;

import com.springtutorial.beans101.services.FortuneService;

/**
 * The coach interface - can be implemented by many classes.
 *
 * @implNote Currently Implemented by:
 * <ul>
 *     <li>{@link BaseballCoach}</li>
 *     <li>{@link FootballCoach}</li>
 *     <li>{@link TrackCoach}</li>
 * </ul>
 */
public interface Coach {


    /**
     * For Bean Lifecycle: Called when a Bean (Coach) is called.
     *
     * @implNote <ul>
     * For init-method:
     * <li>Access modifier can be private, protected, public.</li>
     * <li>Method cannot return value (hence, type void).</li>
     * <li>Cannot have arguments.</li>
     * </ul>
     */
    void initBeanMethod();

    /**
     * For Bean Lifecycle: Called when a Bean (Coach) is destroyed.
     *
     * @implNote <ul>
     * For destroy-method:
     * <li>Access modifier can be private, protected, public.</li>
     * <li>Method cannot return value (hence, type void).</li>
     * <li>Cannot have arguments.</li>
     * </ul>
     */
    void destroyBeanMethod();

    String getDailyWorkout();

    String getDailyFortune();

    /**
     * Setter Injection for <b>fortuneServiceParam</b>.
     *
     * @param fortuneServiceParam Dependency Injection of {@link FortuneService}.
     */
    void setFortuneService(FortuneService fortuneServiceParam);

    String getEmailAddress();

    /**
     * Setter Injection with literal value for <b>emailAddress</b>.
     *
     * @param emailAddress Dependency Injection of {@link String}.
     */
    void setEmailAddress(String emailAddress);

    String getTeam();

    /**
     * Setter Injection for literal value <b>team</b>.
     *
     * @param team Dependency Injection of {@link String}.
     */
    void setTeam(String team);

}

