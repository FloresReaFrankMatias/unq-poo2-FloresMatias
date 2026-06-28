package ar.edu.unq.poo2.Parciales.Ministerio;

import java.time.LocalDate;

// Component (Composite) — contrato uniforme para Proyecto y Programa.
public interface UnidadPlanificable {
	   public LocalDate fechaDeInicio();
	   public float inversionTotal();
}

