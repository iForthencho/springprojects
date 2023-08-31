package com.springtut2.springcoredemo.rest;

import com.springtut2.springcoredemo.common.Leader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Leader myLeader;

    @Autowired
    public DemoController (@Qualifier("blueTeamLeader") Leader theLeader) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myLeader = theLeader;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myLeader.getDailyWorkout();
    }
}
