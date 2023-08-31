package com.springtut2.springcoredemo.common;

public class NavyLeader implements Leader{

    public NavyLeader() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Ship Maintenance run";
    }
}
