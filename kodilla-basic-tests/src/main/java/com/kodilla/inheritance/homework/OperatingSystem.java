package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year){
        this.year = year;
        System.out.println("OS constructor");
        System.out.println(year);
    }

    public void turnOn() {
        System.out.println("OS turned on");
    }

    public void turnOff() {
        System.out.println("OS turned off");
    }
}

