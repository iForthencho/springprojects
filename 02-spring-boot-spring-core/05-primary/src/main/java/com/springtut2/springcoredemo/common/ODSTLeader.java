package com.springtut2.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ODSTLeader implements Leader{

    @Override
    public String getDailyWorkout() {
        return "Weight training for 3 hours";
    }
}
