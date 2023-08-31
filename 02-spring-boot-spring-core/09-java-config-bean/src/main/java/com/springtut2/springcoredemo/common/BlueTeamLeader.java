package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

import java.lang.module.Configuration;

@Component
public class BlueTeamLeader implements Leader {

    public BlueTeamLeader() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Firing range for 30 minutes";
    }
}
