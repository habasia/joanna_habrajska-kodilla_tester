package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        List<Flight> result = new FlightFinder().findFlightsFrom("Wroclaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Wroclaw", "Nottingham"));
        expectedList.add(new Flight("Wroclaw", "Newcastle"));
        System.out.println(expectedList.toString());
        System.out.println(result.toString());
        assertEquals(expectedList, result);
    }

    @Test
    void findFlightsTo() {
        List<Flight> result = new FlightFinder().findFlightsTo("Wroclaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Nottingham", "Wroclaw"));
        expectedList.add(new Flight("Newcastle", "Wroclaw"));
        System.out.println(expectedList.toString());
        System.out.println(result.toString());
        assertEquals(expectedList, result);
    }
}