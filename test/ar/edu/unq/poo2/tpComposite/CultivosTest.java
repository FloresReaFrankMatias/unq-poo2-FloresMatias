package ar.edu.unq.poo2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tpComposite.Cultivos.ParcelaCompuesta;
import ar.edu.unq.poo2.tpComposite.Cultivos.ParcelaComun;
import ar.edu.unq.poo2.tpComposite.Cultivos.Soja;
import ar.edu.unq.poo2.tpComposite.Cultivos.Trigo;


class CultivosTest {
	ParcelaCompuesta parcelaCompuesta;
	ParcelaCompuesta parcelaCompuesta2;
	ParcelaComun parcelaTrigo;
	ParcelaComun parcelaTrigo2;
	ParcelaComun parcelaSoja;
	Trigo trigo;
	Soja soja;
	@BeforeEach
	void setUp() throws Exception {
		parcelaCompuesta = new ParcelaCompuesta();
		parcelaCompuesta2 = new ParcelaCompuesta();
		trigo= new Trigo();
		soja = new Soja();
		
		parcelaTrigo = new ParcelaComun(trigo);
		parcelaTrigo2 = new ParcelaComun(trigo);
		parcelaSoja = new ParcelaComun(soja);
	}

	
	@Test
	void testGananciaAnualParcelaComunes() {
		assertEquals(300, parcelaTrigo.gananciaAnual());
		assertEquals(500, parcelaSoja.gananciaAnual());
	}
	@Test
	void testGananciaAnualParcelaCompuestaSola() {
		
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		assertEquals( 400, parcelaCompuesta.gananciaAnual() );		
	}

	@Test
	void testGananciaAnualParcelaCompuestasYComunes() {
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		parcelaCompuesta.addParcela(parcelaSoja);
		
		parcelaCompuesta2.addParcela(parcelaTrigo);
		parcelaCompuesta2.addParcela(parcelaSoja);
		
		
		parcelaCompuesta.addParcela(parcelaCompuesta2);
		assertEquals( 375, parcelaCompuesta.gananciaAnual() );
		
		
	}
	@Test
	void testAgregarParcelaFallaAlTenerLasParcelascompletas() {
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		assertThrows(RuntimeException.class, () -> parcelaCompuesta.addParcela(parcelaTrigo));
		
	}
	@Test
	void testEliminarParcelaInexistenteFalla() {
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		parcelaCompuesta.addParcela(parcelaSoja);
		parcelaCompuesta.addParcela(parcelaTrigo);
		assertThrows(RuntimeException.class, () -> parcelaCompuesta.deleteParcela(parcelaTrigo2));
	}
}
