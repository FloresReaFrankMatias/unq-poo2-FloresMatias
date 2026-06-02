package ar.edu.unq.poo2.tpStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StrategyCambiarANumero implements EncryptingStrategy {
	private final Map<Character, Integer> diccionario = new HashMap<>();
	public StrategyCambiarANumero() {
		// TODO Auto-generated constructor stub
		diccionario.put(' ', 0);
	    
	    // Llenamos el abecedario del 1 al 26
	    int valor = 1;
	    for (char c = 'a'; c <= 'z'; c++) {
	        diccionario.put(c, valor);
	        valor++;
	    }
	}
	@Override
	public String encriptar(String txt) {
	    if (txt == null || txt.isEmpty()) return "";

	    return txt.toLowerCase().chars()
	            .mapToObj(c -> (char) c)
	            .map(caracter -> {
	                Integer num = diccionario.get(caracter);
	                System.out.println("Letra evaluada: '" + caracter + "' -> Trajo del mapa: " + num);
	                return num;
	            })
	            .map(String::valueOf)                       
	            .collect(Collectors.joining(","));
	}
//	@Override
//	public String encriptar(String txt) {
//		// TODO Auto-generated method stub
//		if (txt == null || txt.isEmpty()) return "";
//
//	    return txt.toLowerCase().chars()
//	            .mapToObj(c -> (char) c)
//	            .map(caracter -> {
//	                Integer num = diccionario.get(caracter);
//	                System.out.println("Letra evaluada: '" + caracter + "' -> Trajo del mapa: " + num);
//	                return num;
//	            }
//	            .map(caracter -> diccionario.get(caracter)) // Devuelve el Integer directo
//	            .map(String::valueOf)                       // Lo convierte a String para el joining
//	            .collect(Collectors.joining(","));          // Los une separados por comas
	
	

	@Override
	public String desencriptar(String txt) {
	    if (txt == null || txt.isEmpty()) return "";

	    // "4,9,5,7,15" -> ["4", "9", "5", "7", "15"]
	    return Arrays.stream(txt.split(","))
	            .map(Integer::parseInt) // Convierte cada "4" en el int 4
	            .map(numero -> {
	                // Buscamos la letra (Key) que tiene ese número (Value)
	                return diccionario.entrySet().stream()
	                        .filter(entry -> entry.getValue().equals(numero))
	                        .map(Map.Entry::getKey)
	                        .findFirst()
	                        .orElse(' '); // Valor por defecto por seguridad, aunque asumimos que existe
	            })
	            .map(String::valueOf)
	            .collect(Collectors.joining()); // Los une a todos juntos sin espacios ni comas
	}
	


	

}
