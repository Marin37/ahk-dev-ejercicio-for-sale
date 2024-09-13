package com.ahk.arg.forsale.controllers;

import com.ahk.arg.forsale.models.entities.Zona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zonas")
public class ZonasController {

    private List<Zona> zonas;


    public ZonasController () {

        this.zonas = new ArrayList<>();

        Zona unaZona = new Zona();
        unaZona.setId(1);
        unaZona.setNombre("juanma");
        unaZona.setPrecio(350.0F);

        this.zonas.add(unaZona);

        Zona zona2 = new Zona();
        zona2.setNombre("Palermo");
        zona2.setPrecio(500F);
        zona2.setId(34);
        this.zonas.add(zona2);
        this.zonas.add(new Zona("Liniers",100F,47));
    }

    @GetMapping
    public ModelAndView listadoDeZonas(Map<String, Object> model) {

        model.put("title", "Besto Lista");
        model.put("zonas", this.zonas);
        return new ModelAndView("zonas", model);
    }
}
