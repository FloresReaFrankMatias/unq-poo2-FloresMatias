package ar.edu.unq.poo2.Parciales.Ministerio;

import java.util.ArrayList;
import java.util.List;

public class SecretariaDeInfraestructura {

	private final List<UnidadPlanificable> unidades = new ArrayList<>();

    public void agregar(UnidadPlanificable unidad) {
        unidades.add(unidad);
    }

    public float inversionTotal() {
        return (float) unidades.stream()
                               .mapToDouble(UnidadPlanificable::inversionTotal)
                               .sum();
    }

}
