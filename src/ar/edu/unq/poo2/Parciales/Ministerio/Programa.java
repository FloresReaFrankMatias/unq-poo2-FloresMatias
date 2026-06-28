package ar.edu.unq.poo2.Parciales.Ministerio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Programa implements UnidadPlanificable {

	private final String nombre;
    private final Empleado lider;        // costo absorbido por costoGestion
    private final float costoGestion;
    private final List<UnidadPlanificable> componentes = new ArrayList<>();

    public Programa(String nombre, Empleado lider, float costoGestion) {
        this.nombre       = nombre;
        this.lider        = lider;
        this.costoGestion = costoGestion;
    }

    public void agregar(UnidadPlanificable unidad) {
        componentes.add(unidad);
    }

    public void quitar(UnidadPlanificable unidad) {
        componentes.remove(unidad);
    }

    // Fecha más temprana entre todos los componentes.
    @Override
    public LocalDate fechaDeInicio() {
        return componentes.stream()
                .map(UnidadPlanificable::fechaDeInicio)
                .min(LocalDate::compareTo)
                .orElseThrow();
    }

    // costoGestion + suma recursiva de inversiones de componentes.
    @Override
    public float inversionTotal() {
        float sumaComponentes = (float) componentes.stream()
                .mapToDouble(UnidadPlanificable::inversionTotal)
                .sum();
        return costoGestion + sumaComponentes;
    }

    public String getNombre() { return nombre; }

}
