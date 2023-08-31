package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BlueTeamLeader implements Leader {
    @Override
    public String getDailyWorkout() {
        return "Firing range for 30 minutes";
    }
}
