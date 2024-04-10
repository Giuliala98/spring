package com.example.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1")
public class FirstController {
    @RequestMapping(path="/ciao/{provincia}", method = RequestMethod.GET)
    public Persona ciao(@RequestParam(name="nome")String nome, @PathVariable("provincia") String provincia) {
        String saluto = "ciao " + nome + " com'è il tempo in " + provincia + "?";
        return new Persona(nome, provincia, saluto);
    }
}
