package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    private boolean headLightsOn = false;

    @Override
    public void turnHeadlightsOn() {
        headLightsOn = true;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headLightsOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
