package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CounterTestCase {
private Counter counter;


	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

		/*
		 * Verifica la cantidad de pares
		 */
	@Test
	public void testEvenNumbers() {
		int cantEven = counter.getCountEvenNumbers();
		assertEquals(cantEven, 1);
	}

	/*
	 * Verifica la cantidad de impares
	 */
	@Test
	public void testOddNumbers() {
		int cantOdd = counter.getCountOddNumbers();
		assertEquals(cantOdd, 9);
	}
	// multiplos
	@Test
	public void testMultiplesOf() {
		int cantMultiples = counter.getCountMultiplesOf(2);
		assertEquals(cantMultiples,1);
	}
}	

