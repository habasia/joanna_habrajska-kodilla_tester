package com.kodilla.collections.adv.exercises.homework;

import java.util.*;


//nie działają mi tutaj rzeczy, nie umiem zrobić, żeby działały :(
public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsTableFrom = new ArrayList<>();
        List <Flight> flightsTable = FlightRepository.getFlightsTable();
        for (Flight flight : flightsTable) {
            if (flight.getDeparture().equals(departure)) {
                flightsTableFrom.add(flight);
            }
        }
        return flightsTableFrom;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTableTo = new ArrayList<>();
        List <Flight> flightsTable = FlightRepository.getFlightsTable();
        for (Flight flight : flightsTable) {
            if (flight.getDeparture().equals(arrival)) {
                flightsTableTo.add(flight);
            }
        }
        return flightsTableTo;
    }
}
