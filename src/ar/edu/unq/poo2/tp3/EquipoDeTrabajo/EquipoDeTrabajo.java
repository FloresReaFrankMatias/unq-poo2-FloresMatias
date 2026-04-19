package ar.edu.unq.poo2.tp3.EquipoDeTrabajo;


import java.util.HashSet;

/*2. Defina la clase EquipoDeTrabajo y modélela en Java. Un equipo tiene un nombre y un conjunto de
     integrantes (que son instancias de Persona).
*/
public class EquipoDeTrabajo  {
	private String nombre;
	
	private HashSet<Persona> integrantes;
	

	public EquipoDeTrabajo( String nombre) {
		super();
		nombre = nombre;
		this.integrantes = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
	public double promedioEdad() {
		double promedio = 0;
		for (Persona p : integrantes) {
			promedio += p.getEdad();
		}
		return promedio/integrantes.size();
	}
	
	public void agregarIntegrantes() {
		EquipoDeTrabajo equipo1 =new EquipoDeTrabajo("Equipo Rojo");
		Persona matias = new Persona("Matias", "Flores", 30);
		Persona juan = new Persona("Juan", "Perez", 25);
		Persona maria = new Persona("Maria", "Gomez", 28);
		Persona ana = new Persona("Ana", "Lopez", 32);
		Persona carlos = new Persona("Carlos", "Garcia", 27);
		
		equipo1.addIntegrante(matias);
		equipo1.addIntegrante(juan);
		equipo1.addIntegrante(maria);
		equipo1.addIntegrante(ana);
		equipo1.addIntegrante(carlos);
	}
	public void imprimirPromedioDeEdad(EquipoDeTrabajo equipo) {
		System.out.println("El promedio de edad del equipo es: " + equipo.promedioEdad());
	}
	
	
}
