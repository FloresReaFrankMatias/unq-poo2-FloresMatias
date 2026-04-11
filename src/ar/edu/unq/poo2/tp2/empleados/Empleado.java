package ar.edu.unq.poo2.tp2.empleados;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private LocalDate fechaNacimiento;
	private float sueldoBasico ;
	private String estadoCivil;
	

	public Empleado(String nombre, String direccion, LocalDate fechaNacimiento, float sueldoBasico, String estadoCivil){
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico= sueldoBasico;
		this.setEstadoCivil(estadoCivil);
	}
	
	public int getEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears(); 
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	 
	//public float sueldoBruto() {
		//return sueldoBasico + sueldoFamiliar()
	//}
	public abstract float sueldoBruto();
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	public float retenciones() {
		return this.obraSocial() + this.aportesJubilatorios() + this.adicionales();
	}
	
	public float obraSocial() {
		return this.sueldoBruto() * 0.10f; // la f es porque es float
	}
	public float aportesJubilatorios() {
		return this.sueldoBruto() * this.porcentajeDeAporteJubilatorio();
	}
	public abstract float adicionales();
	public abstract float porcentajeDeAporteJubilatorio();

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String desgloseConceptos() {
		return  "Sueldo Básico: $" + this.sueldoBasico +
				"\nRetención Obra Social: $" + this.obraSocial() +
	              "\nRetención Jubilación: $" + this.aportesJubilatorios();
				
	}

	


}
