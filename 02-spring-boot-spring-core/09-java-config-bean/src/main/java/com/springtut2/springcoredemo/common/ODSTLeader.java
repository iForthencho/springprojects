package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class ODSTLeader implements Leader{

    public ODSTLeader() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Weight training for 3 hours";
    }
}
