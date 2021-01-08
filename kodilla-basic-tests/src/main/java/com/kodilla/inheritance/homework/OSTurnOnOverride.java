package com.kodilla.inheritance.homework;

public class OSTurnOnOverride extends OperatingSystem {

    public OSTurnOnOverride(int year) {
        super(year);
        System.out.println("OS turn on constructor");
        System.out.println(year);
    }

    public void turnOn() {
        System.out.println("OS turned on overridden");
    }
}
