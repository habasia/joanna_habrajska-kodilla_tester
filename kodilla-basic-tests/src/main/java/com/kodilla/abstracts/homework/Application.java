package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(1);
        System.out.println("area of the circle: " + circle.area());
        System.out.println("circuit of the circle: " + circle.circuit());

        Shape square = new Square(2);
        System.out.println("area of the square: " + square.area());
        System.out.println("circuit of the square: " + square.circuit());

        Shape rectangle = new Rectangle(2, 1);
        System.out.println("area of the rectangle: " + square.area());
        System.out.println("circuit of the rectangle: " + square.circuit());
    }
}
