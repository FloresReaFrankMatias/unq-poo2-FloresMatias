package ar.edu.unq.poo2.tpState.ReproductorMP3;

public class EstadoSeleccionando implements EstadoRMP3 {

	public EstadoSeleccionando() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		reproductor.getCancionActual().play();
		reproductor.setState(new EstadoReproduciendo());

	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede pausar si no se esta reproduciendo");

	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede pasar si no se esta reproduciendo");

	}

}
