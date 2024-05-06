package com.example.Middleware1.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyCode() {
        throw new ResponseStatusException(HttpStatus.GONE, "This is just old code");
    }
}