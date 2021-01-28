package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;
import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        // draw a kind of the shape
        int drawnCarKind = random.nextInt(3);     // possible values: 0, 1, 2

        if (drawnCarKind == 0)
            return new Renault();
        else if (drawnCarKind == 1)
            return new Volvo();
        else
            return new Dodge();
    }
}