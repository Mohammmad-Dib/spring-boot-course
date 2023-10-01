package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("constructor for : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Tennnnnnnnnis Coach";
    }

    // initial method
    @PostConstruct
    public void doStartupStuff() {
        System.out.println("doStartupStuff : " + getClass().getSimpleName());
    }

    //destroy method
    @PreDestroy
    public void doCleanStuff() {
        System.out.println("doCleanStuff : " + getClass().getSimpleName());
    }
}
