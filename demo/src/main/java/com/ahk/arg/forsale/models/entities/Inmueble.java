package com.ahk.arg.forsale.models.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Inmueble {
    protected Integer cantAmbientes;
    protected Float tamanioM2;
    private Zona zona;

    public abstract Float precio();

    public Float precioFinal() {
        return precio() + zona.getPrecio();
    }

}
