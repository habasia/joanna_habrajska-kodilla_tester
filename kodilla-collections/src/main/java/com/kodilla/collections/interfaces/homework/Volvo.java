package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private int speed;

    public Volvo() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}
