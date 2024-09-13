package com.ahk.arg.forsale.models.entities;

public class PH extends Inmueble {

    @Override
    public Float precio(){
        return Float.valueOf(500000F + 14000F * super.tamanioM2);
    }

}
