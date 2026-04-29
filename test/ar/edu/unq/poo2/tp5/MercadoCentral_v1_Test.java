package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral.Caja;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral.Producto;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral.ProductoCooperativa;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral.ProductoEmpresa;

class MercadoCentral_v1_Test {
	ProductoEmpresa arroz;
	ProductoEmpresa vino;
	ProductoCooperativa galleta;
	ProductoEmpresa leche;
	Caja caja1;
	
	
	

	@BeforeEach
	void setUp()   {
		arroz = new ProductoEmpresa(18d, 2);
		vino = new ProductoEmpresa(55d, 5);
		galleta = new ProductoCooperativa(20d, 20);
		leche = new ProductoEmpresa(30d, 0);
		caja1 = new Caja();
	}

	@Test
	void testMontodeCadaProducto() {
		assertEquals(18d, arroz.montoTotal());
		assertEquals(55d, vino.montoTotal());
		assertEquals(18.0d, galleta.montoTotal());
		
	}
	@Test
	void testRegistrarProducto() {
		caja1.registrarProducto(arroz);
		caja1.registrarProducto(vino);
		caja1.registrarProducto(galleta);
		assertEquals(91d, caja1.montoTotalAPagar());
	}
	
	
	@Test
	void testRegistarSinstock() {
		caja1.registrarProducto(arroz);
		caja1.registrarProducto(arroz);
		caja1.registrarProducto(vino);
		assertThrows(IllegalArgumentException.class, () -> caja1.registrarProducto(leche));
		assertThrows(IllegalArgumentException.class, () -> caja1.registrarProducto(arroz));
		assertEquals(91d, caja1.montoTotalAPagar());
	}

	
}
