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

    private Leader anotherLeader;

    @Autowired
    public DemoController (
                @Qualifier("blueTeamLeader") Leader theLeader,
                @Qualifier("blueTeamLeader") Leader theAnotherLeader) {

        System.out.println("In constructor: " + getClass().getSimpleName());
        myLeader = theLeader;
        anotherLeader = theAnotherLeader;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myLeader.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myLeader == anotherLeader, " + (myLeader == anotherLeader);
    }
}
