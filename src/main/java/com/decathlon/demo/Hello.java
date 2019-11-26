package com.decathlon.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Hello {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
