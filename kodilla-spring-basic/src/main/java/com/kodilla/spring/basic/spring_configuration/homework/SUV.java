package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    private boolean headLightsOn = false;

    @Override
    public void turnHeadlightsOn() {
        headLightsOn = true;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if ( LocalTime.now().isAfter(LocalTime.of(20, 00,00)) || (LocalTime.now().isBefore(LocalTime.of(6, 00,00)))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
