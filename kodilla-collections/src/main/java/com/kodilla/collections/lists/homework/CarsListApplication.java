package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.*;
import com.kodilla.collections.arrays.homework.CarUtils;


import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Dodge());
        cars.add(new Renault());
        cars.add(new Volvo());
        cars.add(new Renault());
        cars.add(new Volvo());
        cars.remove(1);
        // jak usunąć obiekt cars.remove(Volvo); ... chyba sie nie da
        cars.remove(new Volvo());
        cars.remove(new Volvo());


        System.out.println(cars.size());
        for(Car car : cars) {
            CarUtils.displayCarInfo(car);
        }
    }
}
