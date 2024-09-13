package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public Mono<String> getAllContents() {
        return Mono.just("Hello World");
    }
}
