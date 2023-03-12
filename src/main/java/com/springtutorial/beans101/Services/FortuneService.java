package com.springtutorial.beans101.Services;

import com.springtutorial.beans101.Entities.Coach.Coach;
import com.springtutorial.beans101.Services.Impl.BadFortuneService;
import com.springtutorial.beans101.Services.Impl.HappyFortuneService;

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
