package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dodge)) return false;
        Dodge dodge = (Dodge) o;
        return getSpeed() == dodge.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }
}
