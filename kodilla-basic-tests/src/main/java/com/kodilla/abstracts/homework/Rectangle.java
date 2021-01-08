package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    double side1;
    double side2;

    public Rectangle (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }

    @Override
    public double circuit() {
        return 2 * side1 + 2 * side2;
    }
}

