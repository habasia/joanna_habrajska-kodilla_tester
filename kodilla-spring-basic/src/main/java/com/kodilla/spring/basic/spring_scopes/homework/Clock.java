package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        System.out.println(LocalDate.now());
    }
}