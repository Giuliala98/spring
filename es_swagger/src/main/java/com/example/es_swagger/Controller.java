package com.example.es_swagger;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class Controller {

    @GetMapping("/name")
    @Operation(summary = "Stampa il nome")
    public String name(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverseName")
    @Operation(summary = "Stampa il nome al contrario")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
