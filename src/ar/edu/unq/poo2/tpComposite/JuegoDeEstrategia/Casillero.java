package ar.edu.unq.poo2.tpComposite.JuegoDeEstrategia;

public class Casillero {
	private int x;
	private int y;
	private boolean tieneLaja;
	public Casillero(int x, int y, boolean tieneLaja) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.tieneLaja = tieneLaja;
	}
	public void ponerLaja() {
		this.tieneLaja = true;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isTieneLaja() {
		return tieneLaja;
	}
	public void setTieneLaja(boolean tieneLaja) {
		this.tieneLaja = tieneLaja;
	}
	public String getCoordenadas() {
		return "(" + x + ", " + y + ")";
	}

}
