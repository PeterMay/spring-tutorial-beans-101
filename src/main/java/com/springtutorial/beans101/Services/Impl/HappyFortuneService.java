package com.springtutorial.beans101.Services.Impl;

import com.springtutorial.beans101.Services.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
