package com.uthman.springlesson.demoApp.components;

import com.uthman.springlesson.demoApp.interfaces.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // creates new instance for every injection
public class FootBallCoach implements Coach {
    @Override
    public String getBeginnerRoutines() {
        return "Squats x15, Jogging 200m, Pushups x10";
    }
}
