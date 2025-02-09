package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import lombok.*;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@Builder
public class HelloWordBean {
    private String name;
    private LocalDateTime birthDate;
}
