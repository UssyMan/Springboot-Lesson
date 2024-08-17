package com.uthman.springlesson.demoApp.components;

import com.uthman.springlesson.demoApp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class SwimmingCoach implements Coach {
    @Override
    public String getBeginnerRoutines() {
        return "Breast Stroke x10, Breathing Exercise 10min";
    }
    @PostConstruct
    public void initialize(){
        System.out.println("Swimming Coach Bean Created");
    }
}
