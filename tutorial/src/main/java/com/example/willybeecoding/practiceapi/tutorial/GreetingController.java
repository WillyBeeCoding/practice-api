package com.example.willybeecoding.practiceapi.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "Hi there! This is a test message for this API!!";
    }
}
