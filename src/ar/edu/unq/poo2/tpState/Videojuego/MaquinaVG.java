package ar.edu.unq.poo2.tpState.Videojuego;

public class MaquinaVG {
	private EstadoMaquinaVG estado;
	public MaquinaVG() {
		this.estado = new EstadoMVGSinFichas();
	}
	public EstadoMaquinaVG getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoMaquinaVG estado) {
		this.estado = estado;
	}
	
	public void iniciarJuego() {
		this.estado.iniciarJuego(this);
	}
	public void ingresarFicha() {
		this.estado.ingresarFicha(this);
	}
	public void terminarJuego() {
		this.estado.terminarJuego(this);
	}
	

}
