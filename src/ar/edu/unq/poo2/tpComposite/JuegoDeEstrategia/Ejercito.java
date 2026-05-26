package ar.edu.unq.poo2.tpComposite.JuegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje {

	private List<Personaje> personajes;
	
	public Ejercito() {
		// TODO Auto-generated constructor stub
		this.personajes= new ArrayList<Personaje>();
	}

	@Override
	public void caminar(Casillero Destino) {
		// TODO Auto-generated method stub
		personajes.stream()
		          .forEach( p -> p.caminar(Destino));

	}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub

	}
	public void addPersonaje(Personaje personaje){
		personajes.add(personaje);
	}
	public void removePersonaje(Personaje personaje){
		personajes.remove(personaje);
	}

}
