package com.ahk.arg.forsale.models.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Casa extends Inmueble {

    private Float valor;

    public Casa(Float valor) {
        this.valor = valor;
    }
    @Override
    public Float precio(){
        return Float.valueOf(valor);
    }


}
