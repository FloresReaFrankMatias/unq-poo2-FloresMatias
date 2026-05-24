package ar.edu.unq.poo2.tpState.Videojuego;

public abstract class EstadoMaquinaVG  {

	public EstadoMaquinaVG() {
		// TODO Auto-generated constructor stub
	}
	public abstract void iniciarJuego(MaquinaVG maquina);
	public abstract void ingresarFicha(MaquinaVG maquina);
	
	public  void terminarJuego(MaquinaVG maquina) {
		maquina.setEstado(new EstadoMVGSinFichas());
	}

}
