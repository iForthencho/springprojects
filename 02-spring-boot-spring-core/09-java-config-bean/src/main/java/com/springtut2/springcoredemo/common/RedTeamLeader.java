package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Marks it as a spring bean for dependency injection
public class RedTeamLeader implements Leader {

    public RedTeamLeader() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Obstacle course for 2 hours";
    }
}
