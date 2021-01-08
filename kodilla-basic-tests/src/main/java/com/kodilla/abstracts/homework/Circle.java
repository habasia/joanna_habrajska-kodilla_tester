package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    final double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double circuit() {
        return 2 * PI * radius;
    }
}
