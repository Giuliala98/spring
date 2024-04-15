package com.example.es_cors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:2020")
public class Controller {

    @GetMapping("/name")
    public String name(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverseName")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
