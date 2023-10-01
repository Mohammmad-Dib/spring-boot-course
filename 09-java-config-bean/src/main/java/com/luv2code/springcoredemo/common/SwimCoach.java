package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("constructor for : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swimmmmmmmmmm Coach";
    }
}
