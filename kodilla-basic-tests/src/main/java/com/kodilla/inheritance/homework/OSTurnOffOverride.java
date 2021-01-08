package com.kodilla.inheritance.homework;

public class OSTurnOffOverride extends OperatingSystem {

    public OSTurnOffOverride(int year) {
        super(year);
        System.out.println("OS turn off constructor");
        System.out.println(year);
    }

    public void turnOff() {
        System.out.println("OS turned off overridden");
    }
}