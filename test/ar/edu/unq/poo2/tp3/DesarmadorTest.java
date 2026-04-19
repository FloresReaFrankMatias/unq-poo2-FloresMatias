package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class DesarmadorTest {
	Desarmador desarmador;
	int[] arregloDeNumeros = {235, 481, 222, 1357};
	@BeforeEach
	
	void setUp() throws Exception {
		desarmador = new Desarmador();
	}

	@Test
	void test() {
		assertEquals(222,desarmador.getNumeroConMasDigitosPares(arregloDeNumeros));
	}

}
