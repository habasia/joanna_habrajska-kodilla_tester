package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renault)) return false;
        Renault renault = (Renault) o;
        return getSpeed() == renault.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }
}
