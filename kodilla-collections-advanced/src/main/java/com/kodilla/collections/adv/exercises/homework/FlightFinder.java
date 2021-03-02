package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;


import java.util.*;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
