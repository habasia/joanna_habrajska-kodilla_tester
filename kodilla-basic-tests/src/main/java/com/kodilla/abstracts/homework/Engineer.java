package com.kodilla.abstracts.homework;

public class Engineer extends Job {

    @Override
    public double salary() {
        return 10000;
    }

    @Override
    public String responsibilities() {
        return "designing, planning, executing";
    }
}
