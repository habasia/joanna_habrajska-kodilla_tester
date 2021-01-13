package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Car dodge = new Dodge();
        doRaceCar(dodge);
        Car volvo = new Volvo();
        doRaceCar(volvo);
        Car renault = new Renault();
        doRaceCar(renault);
    }

    private static void doRaceCar(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
