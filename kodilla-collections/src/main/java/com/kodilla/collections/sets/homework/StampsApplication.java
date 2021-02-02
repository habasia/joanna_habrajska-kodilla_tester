package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Krakow","15x15",false));
        stamps.add(new Stamp("London","20x20",false));
        stamps.add(new Stamp("London","20x20",true));
        stamps.add(new Stamp("Krakow","15x15",false));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
