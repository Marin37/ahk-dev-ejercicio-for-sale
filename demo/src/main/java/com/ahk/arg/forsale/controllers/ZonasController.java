package com.ahk.arg.forsale.controllers;

import com.ahk.arg.forsale.models.entities.Zona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/zonas")
public class ZonasController {

    private List<Zona> lugares;

    public ZonasController() {
        this.lugares = new ArrayList<>();
        Zona zona1 = new Zona();
        zona1.setNombre("Devoto");
        this.lugares.add(zona1);
    }

    @GetMapping
    public ResponseEntity<List<Zona>> buscarTodos() {
        return new ResponseEntity<>(this.lugares, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Zona> crearZona(@RequestBody Zona zona) {
        this.lugares.add(zona);
        return new ResponseEntity<>(zona, HttpStatus.CREATED);
    }
}
