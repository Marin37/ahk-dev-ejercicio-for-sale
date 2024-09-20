package com.ahk.arg.forsale.controllers;

import com.ahk.arg.forsale.models.entities.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/inmuebles")
public class InmueblesController {

    private List<Inmueble> inmuebles;
    private List<Zona> zonas;


    public InmueblesController() {

        inmueblesTest();
    }

    private void inmueblesTest() {
        Zona zonaUno = new Zona("Juanma", 250000F,1);
        Zona zonaDos = new Zona("Palermo",500000F,34);
        Zona zonaTres = new Zona("Liniers",100000F,47);

        this.inmuebles = new ArrayList<>();

        Casa unaCasa = new Casa(400000F);
        unaCasa.setCantAmbientes(5);
        unaCasa.setTamanioM2(250F);
        unaCasa.setZona(zonaUno);
        unaCasa.calcularPrecioFinal();

        Departamento unDepto = new Departamento();
        unDepto.setCantAmbientes(2);
        unDepto.setTamanioM2(80F);
        unDepto.setZona(zonaDos);
        unDepto.calcularPrecioFinal();

        PH unPH = new PH();
        unPH.setCantAmbientes(3);
        unPH.setTamanioM2(120F);
        unPH.setZona(zonaTres);
        unPH.calcularPrecioFinal();

        this.inmuebles.add(unaCasa);
        this.inmuebles.add(unDepto);
        this.inmuebles.add(unPH);
    }

    @GetMapping
    public ModelAndView listadoDeInmuebles(Map<String, Object> model) {

        model.put("title", "Lista de Inmuebles");
        model.put("inmuebles", this.inmuebles);
        return new ModelAndView("inmueble/inmuebles", model);
    }

    // Formulario para agregar Imueble
    @GetMapping("/inmuebleForm")
    public ModelAndView mostrarFormularioAgregarInmueble(Map<String, Object> model) {
        model.put("title","Agregar Inmueble");
        return new ModelAndView("inmueble/inmuebleForm",model);
    }
}
