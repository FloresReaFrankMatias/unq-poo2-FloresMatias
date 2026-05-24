package ar.edu.unq.poo2.tpState.ReproductorMP3;

public class EstadoPausado implements EstadoRMP3 {

	public EstadoPausado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede reproducir si esta pausado");
		

	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		reproductor.getCancionActual().play();
		reproductor.setState(new EstadoReproduciendo());
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		reproductor.getCancionActual().stop();
		reproductor.setState(new EstadoSeleccionando());

	}

}
