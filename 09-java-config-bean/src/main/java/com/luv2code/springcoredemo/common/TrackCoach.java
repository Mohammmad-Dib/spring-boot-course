package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("constructor for : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Ttttttttttttttttrrack Coach";
    }
}
