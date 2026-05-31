package ar.edu.unq.poo2.tpTestDoubles;

public enum Palo {
	Picas("P"), 
	Corazones("C"), 
	Diamantes("D"), 
	Treboles("T");
	private String palo;
	
	Palo(String palo) {
		// TODO Auto-generated constructor stub
		this.palo = palo;
	}
	public String getPalo() {
		return palo;
	}
}
