package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.Trabajador.Ingreso;
import ar.edu.unq.poo2.tp4.Trabajador.IngresoHoraExtra;
import ar.edu.unq.poo2.tp4.Trabajador.Trabajador;

class TrabajadorTest {

     Trabajador juan;

    @BeforeEach
    void setUp() {
        juan = new Trabajador();
    }

    @Test
    void testSoloIngresosComunes() {
        juan.addIngreso(new Ingreso("Enero", "Sueldo", 1000.0));
        juan.addIngreso(new Ingreso("Febrero", "Sueldo", 1000.0));

        assertEquals(2000.0, juan.getTotalPercibido());
        assertEquals(2000.0, juan.getMontoImponible());
        assertEquals(40.0, juan.getImpuestoAPagar());
    }

    @Test
    void testSoloHorasExtras() {
        juan.addIngreso(new IngresoHoraExtra("Marzo", "Extras", 500.0, 5));
        
        assertEquals(500.0, juan.getTotalPercibido());
        assertEquals(0.0, juan.getMontoImponible());
        assertEquals(0.0, juan.getImpuestoAPagar());
    }

    @Test
    void testIngresosoMixto() {
        juan.addIngreso(new Ingreso("Abril", "Sueldo", (double)2000));
        juan.addIngreso(new IngresoHoraExtra("Abril", "Extras", (double)800, 10));

        assertEquals((double)2800, juan.getTotalPercibido());
        assertEquals((double)2000, juan.getMontoImponible());
        assertEquals((double)40, juan.getImpuestoAPagar());
    }

    
}