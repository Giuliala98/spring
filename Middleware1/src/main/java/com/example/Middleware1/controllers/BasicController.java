package com.example.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BasicController {

    @GetMapping("/time")
    public String getCurrentDateTime() {
        return "Current Date/Time: " + new java.util.Date();
    }
}
