package com.car.dealership.cars.Controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello fffff";
    }
}
