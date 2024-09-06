package com.ahk.arg.forsale.models.entities;

public class Departamento extends Inmueble {

    @Override
    public Float precio(){
        return Float.valueOf(350000 + super.cantAmbientes);
    }
}
