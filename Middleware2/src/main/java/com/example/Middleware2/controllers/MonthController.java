package com.example.Middleware2.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.Month;

@RestController
@RequestMapping("/month")
@AllArgsConstructor
public class MonthController {

    @GetMapping("")
    public Month getMonth(@ModelAttribute("month") Month month){
        return month;
    }
}
