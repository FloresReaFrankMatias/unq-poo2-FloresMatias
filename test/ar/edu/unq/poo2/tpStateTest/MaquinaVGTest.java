package ar.edu.unq.poo2.tpStateTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tpState.Videojuego.EstadoMVG1Ficha;
import ar.edu.unq.poo2.tpState.Videojuego.EstadoMVG2Fichas;
import ar.edu.unq.poo2.tpState.Videojuego.EstadoMVGSinFichas;
import ar.edu.unq.poo2.tpState.Videojuego.MaquinaVG;

class MaquinaVGTest {
	MaquinaVG maquina;
	
	@BeforeEach
	void setUp() throws Exception {
		maquina = new MaquinaVG();
	}

	@Test
	void testMaquinaSinfichasIntentanIniciarjuego() {
		
		assertThrows(RuntimeException.class, ()-> maquina.iniciarJuego());
	}
	@Test
	void testMaquinaSinfichasIngresan1FichaYPuedeJugar() {
		maquina.ingresarFicha();
		maquina.iniciarJuego();
		assertEquals(EstadoMVG1Ficha.class , maquina.getEstado().getClass());
		
	}
	@Test
	void testMaquinaSinfichasIngresan2FichaYPuedeJugar() {
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.iniciarJuego();
		assertEquals(EstadoMVG2Fichas.class , maquina.getEstado().getClass());
		
	}
	@Test
	void testMaquinaCon2fichasIngresaUnaMasYReiniciaElJuego() {
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		assertThrows(RuntimeException.class, ()-> maquina.iniciarJuego());
		assertEquals(EstadoMVGSinFichas.class , maquina.getEstado().getClass());
		
	}
	
}
