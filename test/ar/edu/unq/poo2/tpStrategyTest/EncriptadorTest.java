package ar.edu.unq.poo2.tpStrategyTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tpStrategy.EncriptadorNaive;
import ar.edu.unq.poo2.tpStrategy.StrategyCambiarANumero;
import ar.edu.unq.poo2.tpStrategy.StrategyCambiarOrden;
import ar.edu.unq.poo2.tpStrategy.StrategyMutarVocales;

class EncriptadorTest {
	EncriptadorNaive enc;
	StrategyCambiarOrden strategyCambiarOrden;
	StrategyCambiarANumero strategyCambiarANumero;
	StrategyMutarVocales strategyVocal;
	@BeforeEach
	void setUp() throws Exception {
		strategyVocal = new StrategyMutarVocales();
		enc = new EncriptadorNaive(strategyVocal );
		strategyCambiarOrden = new StrategyCambiarOrden();
		strategyCambiarANumero = new StrategyCambiarANumero();
		
	}

	@Test void testEncriptar_ConStrategyVocal() { 
		//vocales: a,e,i,o,u
		enc.setStrategy(strategyVocal);
		assertEquals("Ubjitus" ,enc.encriptar("Objetos"));
		assertEquals("Prugremecoun Cun Ubjitus" ,enc.encriptar("Programacion Con Objetos"));
		assertEquals("Munter" ,enc.encriptar("Montar"));
		assertEquals("Pamblam" ,enc.encriptar("Pumblum"));
		}
	
	/**
	 * 
	 */
	@Test void testEncritar_ConStrategyDeNumeros() {
		enc.setStrategy(strategyCambiarANumero );
		
		assertEquals("1,2,3,4,5" ,enc.encriptar("abcde"));
		assertEquals("8,15,12,1,0,13,21,14,4,15" ,enc.encriptar("Hola Mundo"));
		assertEquals("4,9,19,3,15,18,4" ,enc.encriptar("Discord"));
	}
	
	@Test 
	void testEncriptar_ConStrategyCambiarOrden() {
	    enc.setStrategy(strategyCambiarOrden ); 

	    assertEquals("Mundo Hola", enc.encriptar("Hola Mundo"));
	    assertEquals("Tres Dos Uno", enc.encriptar("Uno Dos Tres"));
	    assertEquals("Objetos", enc.encriptar("Objetos")); 
	}

}
