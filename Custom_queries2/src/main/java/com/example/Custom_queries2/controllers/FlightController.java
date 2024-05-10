package com.example.Custom_queries2.controllers;

import com.example.Custom_queries2.entities.Flight;
import com.example.Custom_queries2.entities.Status;
import com.example.Custom_queries2.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/add")
    public List<Flight> getFlights(@RequestParam(name = "n", defaultValue = "100") int n) {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            Flight flight = new Flight();
            StringBuilder randomFromAirport = new StringBuilder();
            for (int y = 0; y < 10; y++) {
                randomFromAirport.append((char) (random.nextInt(26) + 'a'));
            }
            StringBuilder randomToAirport = new StringBuilder();
            for (int x = 0; x < 10; x++) {
                randomToAirport.append((char) (random.nextInt(26) + 'a'));
            }
            flight.setFromAirport("Airport: " + randomFromAirport);
            flight.setToAirport("Airport: " + randomToAirport);
            flight.setStatus(Status.values()[random.nextInt(Status.values().length)]);
            flights.add(flight);
            flightRepository.save(flight);
        }

        return flights;
    }

    @GetMapping("/")
    public List<Flight> getSortedFlights() {
        return flightRepository.findAll(Sort.by(Sort.Order.asc("fromAirport")));
    }

    @GetMapping("/ontime")
    public List<Flight> getOnTimeFlights() {
        return flightRepository.findByStatusOntime();
    }

    @GetMapping("/status")
    public List<Flight> getFlightsByStatus(@RequestParam("p1") Status p1, @RequestParam("p2") Status p2) {
        return flightRepository.findByStatusIn(p1, p2);
    }
}
