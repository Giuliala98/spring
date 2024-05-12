package com.example.EnvironmentVariables1;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingMessageController {
    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping("/greeting")
    public String greeting(){
        return "Hello, " + devName + "! Here's your identification code: " + authCode;

    }
}
