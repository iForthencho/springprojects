package com.springtut2.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BlackTeamLeader implements Leader{

    @Override
    public String getDailyWorkout () {
        return "Recon assessments";
    }
}
