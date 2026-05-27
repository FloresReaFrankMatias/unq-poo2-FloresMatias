package ar.edu.unq.poo2.tpTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class Empresa   {
	private List<Empleado> empleados;
	private int reservas;
	public Empresa(int reservas) {
		// TODO Auto-generated constructor stub
		this.empleados = new ArrayList<Empleado>();
		this.reservas=reservas;
	}
	public int sueldosAPagar() {
		return empleados.stream()
		                .mapToInt(e -> e.sueldo())
		                .sum();
	}
	public void pagarSueldos() {
		reservas -= this.sueldosAPagar();
	}

	

}
