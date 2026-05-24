package ar.edu.unq.poo2.tpState.ReproductorMP3;

public class Song {
	private String nombre;
	public Song(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}
	public void play() {
		System.out.println("Reproduciendo "+ this.nombre);
	}
	public void pause() {
		System.out.println("Pausando "+ this.nombre);
	}
	public void stop() {
		System.out.println("Seleccionando "+ this.nombre);
	}

}
