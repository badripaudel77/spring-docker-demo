package com.io.docker.spring.springdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDockerAppApplication.class, args);
        System.out.println("App is up and running");
    }

    @GetMapping("/")
    public String dockerWorld() {
        return "Hello Docker World";
    }
}
