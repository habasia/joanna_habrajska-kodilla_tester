package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();

        flightsTable.add(new Flight("Wroclaw", "Nottingham"));
        flightsTable.add(new Flight("Nottingham", "Wroclaw"));
        flightsTable.add(new Flight("Wroclaw", "Newcastle"));
        flightsTable.add(new Flight("Newcastle", "Wroclaw"));
        flightsTable.add(new Flight("Edinburgh", "Krakow"));
        flightsTable.add(new Flight("Krakow", "Edinburgh"));
        flightsTable.add(new Flight("Warsaw", "London"));
        flightsTable.add(new Flight("London", "Warsaw"));
        flightsTable.add(new Flight("Warsaw", "Lviv"));
        flightsTable.add(new Flight("Lviv", "Warsaw"));

        return flightsTable;
    }
}
