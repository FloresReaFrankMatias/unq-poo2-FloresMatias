package ar.edu.unq.poo2.tpState.ReproductorMP3;

public class EstadoReproduciendo implements EstadoRMP3 {

	public EstadoReproduciendo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede reproducir si ya se esta reproduciendo");
		
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		reproductor.getCancionActual().pause();
		reproductor.setState(new EstadoPausado());
		
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		reproductor.getCancionActual().stop();
		reproductor.setState(new EstadoSeleccionando());
		
	}

}
