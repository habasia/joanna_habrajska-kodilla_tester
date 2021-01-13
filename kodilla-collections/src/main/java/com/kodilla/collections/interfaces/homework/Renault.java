package com.kodilla.collections.interfaces.homework;

public class Renault implements Car{

    private int speed;

    public Renault() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}
