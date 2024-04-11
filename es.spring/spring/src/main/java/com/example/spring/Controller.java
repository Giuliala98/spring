package com.example.spring;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/reverseName")
    public String reverseName(@RequestParam String name) {
        StringBuilder sb = new StringBuilder().append(name).reverse();
        return sb.toString();
    }
}
