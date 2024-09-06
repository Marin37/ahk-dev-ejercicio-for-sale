package com.ahk.arg.forsale.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public String hello() {
        return  "hello ähk!";
    }

    @GetMapping("/tuki")
    public String tuki() {
        return  "<h1 style='font-size:400'>Tuki</h1>";
    }

    @GetMapping("/hello/{nombre}")
    public String helloTo(@PathVariable String nombre) {
        return nombre;
    }

    @GetMapping("/hello-complex")
    public String helloComplex(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam(value = "peso", required = false) Optional<Integer> peso)
    {
        return "hola " + nombre + " " + apellido;
    }

}
