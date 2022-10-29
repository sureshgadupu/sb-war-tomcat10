package dev.fullstackcode.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/welcome")
public class WelcomeController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello World!";
    }

}
