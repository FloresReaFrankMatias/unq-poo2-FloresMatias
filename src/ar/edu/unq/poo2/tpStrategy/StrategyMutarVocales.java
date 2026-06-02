package ar.edu.unq.poo2.tpStrategy;

import java.util.stream.Collectors;

public class StrategyMutarVocales implements EncryptingStrategy {

	public StrategyMutarVocales() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String encriptar(String txt) {
		// TODO Auto-generated method stub
		return txt.chars() // 1. Crea un IntStream con los códigos ASCII/Unicode
	            .mapToObj(c -> (char) c) // 2. Convierte cada código a un objeto Character
	            .map(this::encriptarVocal) // 3. Aplica tu lógica de transformación
	            .map(String::valueOf) // 4. Convierte cada Character a String
	            .collect(Collectors.joining()); // 5. Los concatena todos en un único String
	}
	
	public Character encriptarVocal(Character vocal) {
		// TODO Auto-generated method stub
		if (vocal.equals('a')) return 'e';
	    if (vocal.equals('e')) return 'i';
	    if (vocal.equals('i')) return 'o';
	    if (vocal.equals('o')) return 'u';
	    if (vocal.equals('u')) return 'a';

	    if (vocal.equals('A')) return 'E';
	    if (vocal.equals('E')) return 'I';
	    if (vocal.equals('I')) return 'O';
	    if (vocal.equals('O')) return 'U';
	    if (vocal.equals('U')) return 'A';

	    return vocal;
		
		
	}
	

	@Override
	public String desencriptar(String txt) {
		// TODO Auto-generated method stub
		return txt.chars() 
	            .mapToObj(c -> (char) c) 
	            .map(this::desencriptarVocal) 
	            .map(String::valueOf) 
	            .collect(Collectors.joining()); 
	}
	public Character desencriptarVocal(Character vocal) {
	    // 1. Manejo de minúsculas (al revés)
	    if (vocal.equals('e')) return 'a';
	    if (vocal.equals('i')) return 'e';
	    if (vocal.equals('o')) return 'i';
	    if (vocal.equals('u')) return 'o';
	    if (vocal.equals('a')) return 'u';

	    // 2. Manejo de mayúsculas (al revés)
	    if (vocal.equals('E')) return 'A';
	    if (vocal.equals('I')) return 'E';
	    if (vocal.equals('O')) return 'I';
	    if (vocal.equals('U')) return 'O';
	    if (vocal.equals('A')) return 'U';

	    // 3. Valor por defecto: se mantiene igual
	    return vocal;
	}

}
