package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp2.empleados.EmpPermanente;
import ar.edu.unq.poo2.tp2.empleados.EmpleadoContratado;
import ar.edu.unq.poo2.tp2.empleados.EmpleadoTemporario;
//assertEquals(439.0, empleadoTemporario.retenciones() );
		//assertEquals(2120.0, empleadoTemporario.sueldoBruto() ); //
		//assertEquals(1681.0, empleadoTemporario.sueldoNeto() ); 
		//assertEquals(950.0, empleadoContratado.sueldoNeto() );
		
		//assertEquals(7170.0, empresa1.montoTotalSueldoBruto() );
		//assertEquals(5608.5, empresa1.montoTotalSueldosNetos() );
		//assertEquals(1561.5, empresa1.montoTotalRetenciones() );


class EmpleadosTest {
	EmpleadoContratado empleadoContratado;
	EmpleadoTemporario empleadoTemporario;
	EmpPermanente empleadoPermanente;
	Empresa empresa1;
	
	@BeforeEach
	void setUp() throws Exception {
	 	empleadoContratado = new EmpleadoContratado("Matias", "Alsina 148", LocalDate.of(2004, 12, 25), 1000.0f, "Soltero", 001, "Efectivo");
		empleadoTemporario = new EmpleadoTemporario("Lucas", "Av La Plata 1672", LocalDate.of(2016, 02, 02), 2000.0f, "Casado",3 , LocalDate.of(2026, 06, 07));
		empleadoPermanente = new EmpPermanente("Fede", "Lavalle 323", LocalDate.of(2000, 06, 07), 3000.0f, "Soltero",3, 12);
		empresa1 = new Empresa( "Arcor SRL","20-24549310-3");
		empresa1.agregarEmpleado(empleadoContratado);
		empresa1.agregarEmpleado(empleadoTemporario);
		empresa1.agregarEmpleado(empleadoPermanente);
	}

	@Test
	void testCalculoSueldoNetoYBruto() {
		
		assertEquals(7170.0, empresa1.montoTotalSueldoBruto() );
		assertEquals(5608.5, empresa1.montoTotalSueldosNetos() );
		
	}
	@Test
	void testLiquidacionDeSueldos() {
		empresa1.liquidarSueldos();
		assertTrue(empresa1.getRecibos().size() == 3);
		assertEquals("Matias",empresa1.getRecibos().get(0).getNombre());
	
		
	}

}
