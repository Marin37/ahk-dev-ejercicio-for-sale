package com.ahk.arg.forsale.models.entities;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Zona {
    private String nombre;
    private Float precio;
    private Integer id;

    public Zona(String nombre, Float precio, Integer id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }
    public Zona(){
        this.nombre = null;
        this.precio = null;
        this.id = null;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
