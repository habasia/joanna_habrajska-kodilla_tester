package com.kodilla.inheritance.homework;

public class OSMain {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem(2000);
        os.turnOn();
        os.turnOff();

        OSTurnOnOverride osOn = new OSTurnOnOverride(2001);
        osOn.turnOn();
        osOn.turnOff();

        OSTurnOffOverride osOff = new OSTurnOffOverride(2002);
        osOff.turnOn();
        osOff.turnOff();
    }

}
