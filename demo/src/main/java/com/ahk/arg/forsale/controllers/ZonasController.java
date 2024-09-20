package com.ahk.arg.forsale.controllers;

import com.ahk.arg.forsale.models.entities.Zona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zonas")
public class ZonasController {

    private List<Zona> zonas;


    public ZonasController () {
        zonasTest();
    }

    private void zonasTest() {
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

    //para el listado de zonas
    @GetMapping
    public ModelAndView listadoDeZonas(Map<String, Object> model) {
        //pasar datos a claves de otro archivo (data binding)
        model.put("title", "Lista de Zonas");
        model.put("zonas", this.zonas);
        return new ModelAndView("zona/zonas", model);
    }

    // Formulario para agregar zona
    @GetMapping("/agregarZona")
    public ModelAndView mostrarFormularioAgregarZona(Map<String, Object> model) {
        model.put("title", "Agregar Zona");
        // nombre del archivo HTML (moustache) del formulario
        return new ModelAndView("zona/agregarZona", model);
    }

    @PostMapping("/guardar")
    public RedirectView guardarZona(@ModelAttribute Zona zona, Map<String, Object> model){
        this.zonas.add(zona);   //agrego la zona a mi coleccion de zonas
        model.put("mensajeExito","Se guardó la zona con éxito!");


        //// levantar la vista de exito (sin hacer get)
        //return new ModelAndView("zonas_exito",model);

        // Redirecciona de vuelta a la lista
        return new RedirectView("/zonas?success=true");
    }


    public RedirectView guardarZona(){

        return new RedirectView("/zonas");
    }


    //aca guardo la zona y redirijo al listado
    @PostMapping("/guardar2")
    public RedirectView guardarZona2(@ModelAttribute Zona zona){
        this.zonas.add(zona);
        return new RedirectView("/zonas");
    }
}
