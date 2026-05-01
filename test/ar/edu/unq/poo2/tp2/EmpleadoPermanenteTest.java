package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp2.empleados.EmpPermanente;

class EmpleadoPermanenteTest {

	 EmpPermanente empleadoPermanente;

	    @BeforeEach
	    void setUp(){
	        empleadoPermanente = new EmpPermanente("Facu", "Lavalle 323", LocalDate.of(2000, 06, 07), 3000.0f, "Soltero",3, 12);
	    }
	    @Test
	    void  testVerificacionDeAtributos(){
	    	assertEquals("Facu", empleadoPermanente.getNombre());
	        assertEquals(25, empleadoPermanente.getEdad());
	        assertEquals("Lavalle 323", empleadoPermanente.getDireccion());
	        assertEquals(3000.0f, empleadoPermanente.getSueldoBasico());
	        assertEquals("Soltero", empleadoPermanente.getEstadoCivil());
	        assertEquals(3, empleadoPermanente.getHijos());
	        assertEquals(12, empleadoPermanente.getAntiguedad());
	        
	    }
	        

	    @Test
	    void testSueldoBruto(){
	        assertEquals(4050.0, empleadoPermanente.sueldoBruto()); 
	    }

	    @Test
	    void testSueldoNeto(){
	        assertEquals(2977.5, empleadoPermanente.sueldoNeto()); 
	    }
	    @Test
	    void testRetenciones(){
	        assertEquals(1072.5, empleadoPermanente.retenciones()); 
	    }
	}