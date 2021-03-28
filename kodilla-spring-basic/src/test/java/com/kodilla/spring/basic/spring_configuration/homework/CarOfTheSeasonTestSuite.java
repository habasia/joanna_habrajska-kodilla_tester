package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CarOfTheSeasonTestSuite {

    @Test
    public void shouldChooseTheCarForCurrentSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("carChoice");
        String carType = car.getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCheckIfHasHeadlightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("carChoice");
        boolean headlights = car.hasHeadlightsTurnedOn();
        Assertions.assertTrue(headlights);
    }
}


