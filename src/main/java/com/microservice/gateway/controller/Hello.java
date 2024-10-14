package com.microservice.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/gateway/hello")
    String sayHello() {
        return "Hello World";
    }

}