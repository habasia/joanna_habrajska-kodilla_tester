package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static List<Flight> getFlightsTable(String airport) {
        List<Flight> connections = new ArrayList<>();
        List<Flight> flightsTable = new ArrayList<>();

        connections.add(new Flight("Wroclaw", "Nottingham"));
        connections.add(new Flight("Nottingham", "Wroclaw"));
        connections.add(new Flight("Wroclaw", "Newcastle"));
        connections.add(new Flight("Newcastle", "Wroclaw"));
        connections.add(new Flight("Edinburgh", "Krakow"));
        connections.add(new Flight("Krakow", "Edinburgh"));
        connections.add(new Flight("Warsaw", "London"));
        connections.add(new Flight("London", "Warsaw"));
        connections.add(new Flight("Warsaw", "Lviv"));
        connections.add(new Flight("Lviv", "Warsaw"));

        for (Flight connection : connections) {
            if (connection.getArrival().equals(airport) || connection.getDeparture().equals(airport)) {
                flightsTable.add(connection);
            }
        }
        return flightsTable;
    }


}
