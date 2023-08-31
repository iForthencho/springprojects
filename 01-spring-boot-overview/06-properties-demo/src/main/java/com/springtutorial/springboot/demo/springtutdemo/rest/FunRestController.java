package com.springtutorial.springboot.demo.springtutdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: leader.name and team.name
    @Value("${leader.name}")
    private String leaderName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "leader: " + leaderName + ", Team name: " + teamName;
    }

    // expose "/"(endpoint) that return "Hello World"
    @GetMapping("/")
    public  String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune() {
        return "Good!";
    }
}
