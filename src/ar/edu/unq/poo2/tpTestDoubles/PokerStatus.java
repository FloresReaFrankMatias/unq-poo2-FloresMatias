package ar.edu.unq.poo2.tpTestDoubles;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerStatus {

	public PokerStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugada verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);

        if (esPoqer(cartas)) {
            return new Jugada(TipoJugada.POKER,valorQueSeRepite(cartas, 4) );
        }
        if (esColor(cartas)) {
            return new Jugada( TipoJugada.COLOR,  obtenerValorMasAlto(cartas));
        }
        if (esTrio(cartas)) {
            return new Jugada( TipoJugada.TRIO,valorQueSeRepite(cartas, 3));
        }
        return new Jugada(TipoJugada.NADA, obtenerValorMasAlto(cartas));
    }
    
	
	
	public ValorCarta obtenerValorMasAlto(List<Carta> cartas) {
		// TODO Auto-generated method stub
		return cartas.stream()
				.map(Carta::getValor)
				.max(ValorCarta::compareTo) // Busca el valor máximo
				.orElse(null);
	}

	public ValorCarta valorQueSeRepite(List<Carta> cartas, int cantidad) {
		// TODO Auto-generated method stub
		return cartas.stream()
				.collect(Collectors.groupingBy(Carta::getValor, Collectors.counting())) // Agrupa y cuenta
				.entrySet().stream()
				.filter(entry -> entry.getValue() == (long) cantidad) // Filtra el que coincide con la cantidad (3 o 4)
				.map(Map.Entry::getKey) // Se queda con la clave (el ValorCarta)
				.findFirst()
				.orElse(null);
	}

	public boolean esTrio(List<Carta> cartas) {
	    return cartas.stream()
	            .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting()))
	            .containsValue(3L);
	}

	public boolean esPoqer(List<Carta> cartas) {
	    return  cartas.stream()
	            // Agrupa extrayendo el valor de cada objeto Carta de la lista
	            .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting()))
	            // Busca si alguno se repite solo 4 veces
	            .containsValue(4L);
	}

	public boolean esColor(List<Carta> cartas) {
        return cartas.stream()
                .map(Carta::getPalo)
                .distinct()
                .count() == 1;
    }
		
	
	

}
