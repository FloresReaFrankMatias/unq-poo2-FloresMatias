package ar.edu.unq.poo2.Parciales.Ministerio;

import java.time.LocalDate;
import java.util.List;

public class Proyecto implements UnidadPlanificable {

	private final String nombre;
    private final Empleado lider;
    private final LocalDate fechaInicio;
    private final int duracionDias;
    private final List<Empleado> empleados;

    public Proyecto(String nombre, Empleado lider, LocalDate fechaInicio,
                    int duracionDias, List<Empleado> empleados) {
        this.nombre       = nombre;
        this.lider        = lider;
        this.fechaInicio  = fechaInicio;
        this.duracionDias = duracionDias;
        this.empleados    = empleados;
    }

    @Override
    public LocalDate fechaDeInicio() {
        return fechaInicio;
    }

    // sueldoEmpleados + sueldo lider con 30% de plus por liderazgo
    @Override
    public float inversionTotal() {
        float sueldoEmpleados = (float) empleados.stream()
                .mapToDouble(e -> e.sueldoDiario() * duracionDias)
                .sum();
        float sueldoLider = lider.sueldoDiario() * duracionDias * 1.30f;
        return sueldoEmpleados + sueldoLider;
    }

    public String getNombre() { return nombre; }

}
