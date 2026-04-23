package ar.edu.unq.poo2.tp2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.poo2.tp2.empleados.Empleado;
import ar.edu.unq.poo2.tp2.Recibo;

public  class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<Recibo> recibos;
	
	public Empresa(String nombre, String cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<>();
		this.recibos = new ArrayList<>();
	}

	
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public List<Recibo> getRecibos() {
		return recibos;
	}
		




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	
	
	public float montoTotalSueldoBruto() {
		float brutoTotal =0;
		for(Empleado e: empleados) {
			brutoTotal += e.sueldoBruto();
		}
		return brutoTotal;
	}
	public float montoTotalSueldosNetos() {
		float netoTotal =0;
		for(Empleado e: empleados) {
			netoTotal += e.sueldoNeto();
		}
		return netoTotal;
	}
	public float montoTotalRetenciones() {
		float retencionesTotales =0;
		for(Empleado e: empleados) {
			retencionesTotales += e.retenciones();
		}
		return retencionesTotales;
	}
	public void liquidarSueldos() {
		for( Empleado e:empleados  ) {
			this.generarRecibo(e);
			
			
		}
	}
	public void generarRecibo(Empleado e) {
		 Recibo nuevoRecibo = new Recibo(e);
	        recibos.add(nuevoRecibo);
	}
	
}
