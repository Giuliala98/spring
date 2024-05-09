package com.example.Custom_queries2.repositories;

import com.example.Custom_queries2.entities.Flight;
import com.example.Custom_queries2.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("SELECT f FROM Flight f WHERE f.fromAirport like %:fromAirport%")
    List<Flight> findByFromAirport(@Param("fromAirport") String fromAirport);

    @Query("SELECT f FROM Flight f WHERE f.status = 'ONTIME'")
    List<Flight> findByStatusOntime();

    @Query("SELECT f FROM Flight f WHERE f.status IN ('p1, p2')")
    List<Flight> findByStatusIn(@Param("p1") Status p1, @Param("p2") Status p2);
}
