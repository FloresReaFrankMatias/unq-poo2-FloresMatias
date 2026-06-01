package ar.edu.unq.poo2.tpTestDoubles;

public enum Palo {
	PICAS("P"), 
	CORAZONES("C"), 
	DIAMANTE("D"), 
	TREBOL("T");
	private String palo;
	
	Palo(String palo) {
		// TODO Auto-generated constructor stub
		this.palo = palo;
	}
	public String getPalo() {
		return palo;
	}
}
