package com.springtut2.springcoredemo.rest;

import com.springtut2.springcoredemo.common.Leader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Leader myLeader;

    @Autowired
    public void setLeader (Leader theLeader) {
        myLeader = theLeader;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myLeader.getDailyWorkout();
    }
}
