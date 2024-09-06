package com.ahk.arg.forsale.models.entities;

import lombok.Setter;

public class Casa extends Inmueble {
    @Setter
    private Float valor;

    @Override
    public Float precio(){
        return Float.valueOf(valor);
    }


}
