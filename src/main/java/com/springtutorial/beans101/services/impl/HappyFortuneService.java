package com.springtutorial.beans101.services.impl;

import com.springtutorial.beans101.services.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
