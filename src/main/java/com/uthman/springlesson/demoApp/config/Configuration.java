package com.uthman.springlesson.demoApp.config;

import com.uthman.springlesson.demoApp.components.RugbyCoach;
import com.uthman.springlesson.demoApp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;


@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean("newCoach") //the name if not specified here will use the method's name as the Beans ID
    @Lazy //this makes the creation of the bean only when needed
    public Coach rugbyCoach(){
        return new RugbyCoach();
    }
}
