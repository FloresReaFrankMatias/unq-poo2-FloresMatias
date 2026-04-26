package ar.edu.unq.poo2.tp4.Trabajador;

import java.util.List;
import java.util.ArrayList;
public class Trabajador {
	private List<Ingreso> ingresos;
	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}
	public void addIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	public Double getTotalPercibido() {
		Double total = 0.0;
		for(Ingreso ingreso : ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public double getMontoImponible() {
		Double totalImponibe = (double) 0;
		for(Ingreso ingreso : ingresos) {
			totalImponibe += ingreso.getMontoImponible();
		}
		return totalImponibe;
	}
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}

}
