package com.kodilla.collections.interfaces.homework;

public class Dodge implements Car {

    private int speed;

    public Dodge() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 70;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}
