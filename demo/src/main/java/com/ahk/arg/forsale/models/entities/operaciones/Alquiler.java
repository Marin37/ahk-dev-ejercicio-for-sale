package com.ahk.arg.forsale.models.entities.operaciones;

import com.ahk.arg.forsale.models.entities.personas.Empleado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alquiler extends Operacion {

    private int cantMeses;

    @Override
    public Float calcularComisionPara(Empleado empleado) {
        Float comision = (cantMeses * inmueble.precioFinal()) / 50000;
        empleado.agregarComision(comision);
        return comision;
    }
}
