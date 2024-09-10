package com.example.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(2)
@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main");
        SpringApplication.run(HelloWorldApplication.class, args);
        System.out.println("End of main");
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello World from Spring Boot!");
    }
}
