package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volvo)) return false;
        Volvo volvo = (Volvo) o;
        return getSpeed() == volvo.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed());
    }
}
