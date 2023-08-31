package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BlackTeamLeader implements Leader{

    public BlackTeamLeader() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout () {
        return "Recon assessments";
    }
}
