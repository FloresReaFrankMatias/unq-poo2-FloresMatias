package ar.edu.unq.poo2.tpTestDoubles;

public class Carta {
	private Palo palo;
	private ValorCarta valor;
	
	
	public Carta(Palo palo, ValorCarta valor) {
		// TODO Auto-generated constructor stub
		this.palo=palo;
		this.valor=valor;
	
	}


	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public ValorCarta getValor() {
		return valor;
	}

	public void setValor(ValorCarta valor) {
		this.valor = valor;
	}
	
	
	

}
