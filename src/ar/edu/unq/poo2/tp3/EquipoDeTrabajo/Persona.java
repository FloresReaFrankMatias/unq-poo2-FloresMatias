package ar.edu.unq.poo2.tp3.EquipoDeTrabajo;

/*
 * Defina la clase Persona y modélela en Java. Una persona tiene su nombre, apellido y edad.

3. Un EquipoDeTrabajo debe saber responder su nombre y el promedio de edad de sus integrantes.
4. Instancie un EquipoDeTrabajo, instancie 5 Personas y agreguelas al mismo.
5. Pida al EquipoDeTrabajo el promedio de edad de sus integrantes e imprima el resultado devuelto.
 * */
public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
