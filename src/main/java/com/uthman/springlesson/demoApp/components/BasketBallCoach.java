package com.uthman.springlesson.demoApp.components;

import com.uthman.springlesson.demoApp.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {
    @Override
    public String getBeginnerRoutines() {
        return "Jump Shots x10, Drills 15min, Freestyle x10";
    }
}
