package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

@RestController
public class HelloWorldController {


    private final Faker faker;
    private final Random random;

    public HelloWorldController(Faker faker) {
        this.faker = faker;
        this.random = new Random();
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWordBean getHelloWorldBean() {
        String name = this.faker.name().fullName();
        LocalDateTime birthDate = this.random.nextBoolean() ? LocalDateTime.now() : null;
        HelloWordBean helloWordBean = HelloWordBean.builder().name(name).birthDate(birthDate).build();
        return helloWordBean;
    }
}
