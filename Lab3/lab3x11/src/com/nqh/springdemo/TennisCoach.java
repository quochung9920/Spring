package com.nqh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // public TennisCoach(FortuneService theFortuneService) {
    //     fortuneService = theFortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    //     System.out.println(">> TennisCoach: inside setFortuneService() method");
    //     this.fortuneService = fortuneService;
    // }
}
