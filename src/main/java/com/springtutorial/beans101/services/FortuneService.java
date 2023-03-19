package com.springtutorial.beans101.services;

import com.springtutorial.beans101.entities.coach.Coach;
import com.springtutorial.beans101.services.impl.BadFortuneService;
import com.springtutorial.beans101.services.impl.HappyFortuneService;

/**
 * To be used as dependency injection on {@link Coach}.
 * <br>
 * Dependency = Helper.
 * <br><br>
 * The FortuneService interface - can be implemented by many classes.
 *
 * @implNote Currently Implemented by:
 * <ul>
 *     <li>{@link HappyFortuneService}</li>
 *     <li>{@link BadFortuneService}</li>
 * </ul>
 */
public interface FortuneService {

    String getFortune();

}
