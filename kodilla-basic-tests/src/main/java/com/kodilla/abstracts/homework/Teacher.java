package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    @Override
    public double salary() {
        return 1000;
    }

    @Override
    public String responsibilities() {
        return "teaching";
    }
}
