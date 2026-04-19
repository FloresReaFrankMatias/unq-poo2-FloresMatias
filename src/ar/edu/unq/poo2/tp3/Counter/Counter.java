package ar.edu.unq.poo2.tp3.Counter;

import java.util.List;
import java.util.ArrayList;

public class Counter {
	private List<Integer> numbers = new ArrayList<Integer>();

	public Counter() {
		super();
		
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void addNumber(Integer n) {
		this.numbers.add(n);
	}
	
	
	//1- Cantidad de Pares de la lista
	public int getCountEvenNumbers() {
		int count = 0;
		for (Integer n : numbers) {
			if (n % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	//2- Cantidad de Impares de la lista
	public int getCountOddNumbers() {
		int count = 0;
		for (Integer n : numbers) {
			if (n % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	//3- Cantidad de Multiplos de un numero pasado por parametro
	public int getCountMultiplesOf(int n) {
		int count = 0;
		for (Integer num : numbers) {
			if (num % n == 0) {
				count++;
			}
		}
		return count;
	}
	
}
