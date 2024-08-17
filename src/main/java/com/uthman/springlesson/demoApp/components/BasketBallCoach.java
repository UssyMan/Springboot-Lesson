package com.uthman.springlesson.demoApp.components;

import com.uthman.springlesson.demoApp.interfaces.Coach;

public class BaskeBallCoach implements Coach {
    @Override
    public String getBeginnerRoutines() {
        return "Jump Shots x10, Drills 15min, Freestyle x10";
    }
}
