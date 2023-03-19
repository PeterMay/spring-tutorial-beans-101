package com.springtutorial.beans101.services.impl;

import com.springtutorial.beans101.services.FortuneService;

public class BadFortuneService implements FortuneService {

    String[] fortuneQuotes;

    public BadFortuneService() {
        this.fortuneQuotes = new String[]{
                "This is not your lucky day...",
                "You've run out of luck today.",
                "404 no luck found today."
        };
    }

    @Override
    public String getFortune() {
        return fortuneQuotes[(int) (Math.random() * 2)];
    }

}
