package com.ahk.arg.forsale.entities;

import com.ahk.arg.forsale.models.entities.Casa;
import com.ahk.arg.forsale.models.entities.Zona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InmuebleTest {

    @Test
    public void PrecioCasaEnRecoleta() {
        Zona recoleta = new Zona();
        recoleta.setNombre("Recoleta");
        recoleta.setPrecio(50.0F);

        Casa casa = new Casa();
        casa.setZona(recoleta);
        casa.setValor(100F);

        Assertions.assertEquals(150F, casa.precioFinal());

    }

}
