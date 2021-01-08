package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double circuit() {
        return 4 * side;
    }
}
