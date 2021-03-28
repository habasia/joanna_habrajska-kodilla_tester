package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarOfTheSeason {

    @Bean
    public Car carChoice() {
        Car car;
        if (LocalDate.now().getMonthValue() >=1 || LocalDate.now().getMonthValue() <=3) {
            car = new SUV();

        } else if (LocalDate.now().getMonthValue() >=7 || LocalDate.now().getMonthValue() <=9) {
            car = new Cabrio();

        } else {
            car = new Sedan();
        }
        if (LocalTime.now().getHour() >= 20 && LocalTime.now().getHour() <= 6) {
            car.turnHeadlightsOn();
        }
        return car;
    }
}
