package ar.edu.unq.poo2.tpTestDoubles;

import java.util.Arrays;
import java.util.List;

public class PokerStatus {

	public PokerStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugada verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);

        
        if (esPoker(cartas)) {
            return new Poqer(valorQueSeRepite(cartas, 4));
        }
        
        if (esColor(cartas)) {
            return new Color(obtenerValorMasAlto(cartas));
        }
        
        if (esTrio(cartas)) {
            return new Trio(valorQueSeRepite(cartas, 3));
        }
        
        return new Nada(obtenerValorMasAlto(cartas));
    }
	
	
	private ValorCarta obtenerValorMasAlto(List<Carta> cartas) {
		// TODO Auto-generated method stub
		return null;
	}

	private ValorCarta valorQueSeRepite(List<Carta> cartas, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean esTrio(List<Carta> cartas) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean esPoker(List<Carta> cartas) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean esColor(List<Carta> cartas) {
        // Si al quitar los palos repetidos queda solo 1, entonces todas tienen el mismo palo
        return cartas.stream()
                .map(Carta::getPalo)
                .distinct()
                .count() == 1;
    }
		
	
	

}
