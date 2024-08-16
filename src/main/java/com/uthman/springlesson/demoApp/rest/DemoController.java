package com.uthman.springlesson.demoApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${person.name}")
    private String person;

    @Value("${person.age}")
    private int age;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World World";
    }
    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "150 pushups A day yaya";
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
}
