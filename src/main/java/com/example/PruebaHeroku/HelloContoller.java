package com.example.PruebaHeroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("/")
    public String hola(){
        return "Hola a la app de nico";
    }
}
