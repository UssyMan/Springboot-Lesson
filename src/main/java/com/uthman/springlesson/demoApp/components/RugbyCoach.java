package com.uthman.springlesson.demoApp.components;

import com.uthman.springlesson.demoApp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class RugbyCoach implements Coach {
    @Override
    public String getBeginnerRoutines() {
        return "Intense endurance Training";
    }
    @PostConstruct
    public void initialized(){
        System.out.println("The Rugby bean is created");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Rugby bean destroyed....");
    }
}
