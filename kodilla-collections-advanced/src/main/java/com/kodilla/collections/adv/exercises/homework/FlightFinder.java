package com.kodilla.collections.adv.exercises.homework;

import java.util.*;


//nie działają mi tutaj rzeczy, nie umiem zrobić, żeby działały :(
public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsTableFrom = new ArrayList<>();
        List <Flight> flightsTable = FlightRepository.getFlightsTable(departure);
        for (Flight connection : flightsTable) {
            if (connection.getDeparture().equals(departure)) {
                flightsTableFrom.add(connection);
            }
        }
        return flightsTableFrom;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTableTo = new ArrayList<>();
        List <Flight> flightsTable = FlightRepository.getFlightsTable(arrival);
        for (Flight connection : flightsTable) {
            if (connection.getDeparture().equals(arrival)) {
                flightsTableTo.add(connection);
            }
        }
        return flightsTableTo;
    }
}
