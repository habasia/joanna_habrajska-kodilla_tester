package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("Car: " + describeCar(car));
    }

    private static String describeCar(Car car) {
        if (car instanceof Renault)
            return "Renault";
        else if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Dodge)
            return "Dodge";
        else
            return "Unknown car name";
    }
}
