package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;


public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipal = new HashMap<>();

        Principal john = new Principal("John", "Stevenson", "College");
        Principal jessie = new Principal("Jessie", "Pinkman", "Primary School");
        Principal bart = new Principal("Bart", "Simpson","High School");

        School johnSchool = new School(5,5,2,2,2,2,2); //20
        School jessieSchool = new School(2,3,5); //10
        School bartSchool = new School(10,10,5,5); //30


        schoolPrincipal.put(john, johnSchool);
        schoolPrincipal.put(jessie, jessieSchool);
        schoolPrincipal.put(bart, bartSchool);

        for (Map.Entry<Principal, School> principalSchoolEntry : schoolPrincipal.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstname() + ", number of students in the school: " +
                    principalSchoolEntry.getValue().getNumberofStudentsInSchool());
    }
}
