package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SayHello {

    @GetMapping("/Hello")
    public String sayHello() {
        return "Hello Leszczu";
}

}
