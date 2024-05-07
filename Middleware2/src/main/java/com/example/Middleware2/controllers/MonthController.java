package com.example.Middleware2.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.time.Month;

@RestController
@RequestMapping("/month")
public class MonthController {

    @GetMapping("")
    public Month getMonth(HttpServletRequest request){
        return (Month) request.getAttribute("selectedMonth");
    }
}
