package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(int... numberOfStudents) {
        for(int number : numberOfStudents) {
            this.numberOfStudents.add(number);
        }
    }

    public int getNumberofStudentsInSchool() {
        int sum = 0;
        for (int number : numberOfStudents)
            sum += number;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                '}';
    }
}
