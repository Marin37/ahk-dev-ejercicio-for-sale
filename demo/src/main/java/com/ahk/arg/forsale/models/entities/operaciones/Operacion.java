package com.ahk.arg.forsale.models.entities.operaciones;

import com.ahk.arg.forsale.models.entities.Inmueble;
import com.ahk.arg.forsale.models.entities.personas.Cliente;
import com.ahk.arg.forsale.models.entities.personas.Empleado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Operacion {
    protected Inmueble inmueble;
    private Cliente cliente;

    public abstract Float calcularComisionPara(Empleado empleado);
}
