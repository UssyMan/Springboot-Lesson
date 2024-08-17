package com.uthman.springlesson.demoApp.rest;

import com.uthman.springlesson.demoApp.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach basketBallCoach;

    private final Coach footBallCoach;
    private final Coach coach;
    private final Coach rugbyCoach;

    // constructor injection, NB the @AutoWire is optional for a single arg contructor
    //The @primary only works when a bean is not specified by @Qualifier
    @Autowired
    public DemoController(
            @Qualifier("basketBallCoach") Coach basketBallCoach,
            @Qualifier("footBallCoach")Coach footBallCoach,
            Coach coach,
            @Qualifier("newCoach") Coach rugbyCoach)
    {
        this.basketBallCoach = basketBallCoach;
        this.footBallCoach = footBallCoach;
        this.coach = coach;
        this.rugbyCoach = rugbyCoach;
    }
    @Value("${person.name}")
    private String person;

    @Value("${person.age}")
    private int age;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World World";
    }
    @GetMapping("/dailyRoutine")
    public String getBeginnerRoutine(){
        return coach.getBeginnerRoutines();
    }
    @GetMapping("/daily-basketball")
    public String getBballRoutine(){
        return basketBallCoach.getBeginnerRoutines();
    }

    @GetMapping("/daily-rugby")
    public String getRugby(){
        return rugbyCoach.getBeginnerRoutines();
    }

    @GetMapping("/dailyFootball")
    public String getFootballRoutines(){
        return footBallCoach.getBeginnerRoutines();
    }
    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "150 push-ups A day yaa";
    }
    @GetMapping("/reading")
    public String getDailyReads(){
        return "30 pages per day !!";
    }

    @GetMapping("/quran")
    public String getDailyQuranRead(){
        return "2 hizb a day!!!";
    }

    @GetMapping("/person-info")
    public ResponseEntity<String> info(){
        String body = "Name: " + person + "\n" + "Age: " + age;
        return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(body);
    }
    @GetMapping("/check")
    public String check(){
        return "Comparing two beans ---- are they equal? : " +(footBallCoach== coach);
        //returns true if the bean is scoped as singleton(by default) or false if it scoped as Prototype;
    }
}
