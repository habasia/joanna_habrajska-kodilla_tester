package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person (String name, int age, Job job) {
        this.firstName = name;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }
}
