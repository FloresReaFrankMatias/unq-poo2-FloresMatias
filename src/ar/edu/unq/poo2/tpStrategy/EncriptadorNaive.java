package ar.edu.unq.poo2.tpStrategy;

public class EncriptadorNaive {
	private EncryptingStrategy strategy ;
	
	
	public EncriptadorNaive(EncryptingStrategy  strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	public void setStrategy(EncryptingStrategy strategy) {
		this.strategy=strategy;
	}
	public EncryptingStrategy getStrategy() {
		return strategy;
	}

	public String encriptar(String txt) {
		return this.getStrategy().encriptar(txt);
	}
	public String desencriptar(String txt) {
		return this.getStrategy().desencriptar(txt);
	}
	
	
}
