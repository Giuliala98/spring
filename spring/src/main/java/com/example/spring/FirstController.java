package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class FirstController {
    @RequestMapping(path="/ciao", method = RequestMethod.GET)
    public Persona ciao(@RequestParam(name="nome")String nome, @RequestParam(name="provincia")String provincia) {
        String saluto = "ciao " + nome + " com'è il tempo in " + provincia + "?";
        return new Persona(nome, provincia, saluto);
    }
}
