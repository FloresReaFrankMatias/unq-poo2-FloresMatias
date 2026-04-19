package ar.edu.unq.poo2.tp3.EquipoDeTrabajo;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("Los Programadores de UNQ");

	    equipo1.addIntegrante(new Persona("Ana", "García", 20));
	    equipo1.addIntegrante(new Persona("Beto", "Pérez", 25));
	    equipo1.addIntegrante(new Persona("Carla", "Gómez", 30));
	    equipo1.addIntegrante(new Persona("Daniel", "López", 35));
	    equipo1.addIntegrante(new Persona("Elena", "Rodríguez", 40));

	    double promedio = equipo1.promedioEdad();
	    System.out.println("El promedio de edad del equipo '" + equipo1.getNombre() + "' es: " + promedio);
	}

}
