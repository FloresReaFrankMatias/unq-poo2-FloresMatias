package ar.edu.unq.poo2.tpState.ReproductorMP3;

public class ReproductorMP3 {
	private EstadoRMP3 estado;
	private Song cancionActual;
	public ReproductorMP3(Song cancionActual) {
		// TODO Auto-generated constructor stub
		this.estado= new EstadoSeleccionando();
		this.cancionActual=cancionActual;
	}
	
	public void setState(EstadoRMP3 estado ) {
		this.estado=estado;
	}
	public EstadoRMP3 getState() {
		return estado;
	}
	public Song getCancionActual() {
		return cancionActual;
	}
	
	
	public void play() {
		estado.play(this);
	}
	public void pause() {
		estado.pause(this);
	}
	public void stop() {
		estado.stop(this);
	}
	

}
