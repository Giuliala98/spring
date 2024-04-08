package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class FirstController {
    @RequestMapping(path="/ciao", method = RequestMethod.GET)
    public String ciao(@RequestParam(name="nome")String nome, @RequestParam(name="regione")String regione){
        String testo1;
        testo1 = "Ciao "+nome+","+" com'è il tempo in "+regione;
        return testo1;
    }
}
