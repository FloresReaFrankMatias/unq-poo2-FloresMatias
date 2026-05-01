package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp2.empleados.EmpleadoContratado;

class EmpleadoContratadoTest {
	EmpleadoContratado empleadoContratado;
	
	@BeforeEach
	void setUp() throws Exception {
	 	empleadoContratado = new EmpleadoContratado("Matias", "Alsina 148", LocalDate.of(2004, 12, 25), 1000.0f, "Soltero", 001, "Efectivo");

	
	}

	@Test
	void testSueldoNeto() {
		assertEquals(950.0, empleadoContratado.sueldoNeto() );
	}
	@Test
	void testSueldoBruto() {
		assertEquals(1000.0, empleadoContratado.sueldoBruto() );
	}
	@Test
	void testRetenciones() {
		assertEquals(50.0, empleadoContratado.retenciones() );
	}

}
