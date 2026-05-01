package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp2.empleados.EmpleadoTemporario;

class EmpleadoTemporarioTest {
	EmpleadoTemporario empleadoTemporario;
	@BeforeEach
	void setUp() throws Exception {
		empleadoTemporario = new EmpleadoTemporario("Lucas", "Av La Plata 1672", LocalDate.of(2016, 02, 02), 2000.0f, "Casado",3 , LocalDate.of(2026, 06, 07));

	}

	@Test
	void testSueldoBruto() {
		assertEquals(2120.0, empleadoTemporario.sueldoBruto() );
	}
	@Test
	void testSueldoNeto() {
		assertEquals(1681.0, empleadoTemporario.sueldoNeto() );
	}
	@Test
	void testRetenciones() {
		assertEquals(439.0, empleadoTemporario.retenciones() );
	}
	

}
