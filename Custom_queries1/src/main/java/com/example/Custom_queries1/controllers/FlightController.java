package com.example.Custom_queries1.controllers;

import com.example.Custom_queries1.entities.Flight;
import com.example.Custom_queries1.entities.Status;
import com.example.Custom_queries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/")
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @GetMapping("/generateFlights")
    public void generateFlights() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription(String.valueOf(random.ints(15)));
            flight.setFromAirpoirt(random.ints(5).toString());
            flight.setToAirport(random.ints(5).toString());
            flight.setStatus(Status.ON_TIME);
            flightRepository.save(flight);
        }
    }
}
