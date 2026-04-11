package ar.edu.unq.poo2.tp2.empleados;


import java.time.LocalDate;

public class   EmpPermanente  extends Empleado{
	private int cantHijos;
	private int antiguedad;
	public EmpPermanente(String nombre, String direccion, LocalDate fechaNacimiento, float sueldoBasico,
			String estadoCivil, int cantHijos, int antiguedad) {
		super(nombre, direccion, fechaNacimiento, sueldoBasico, estadoCivil);
		this.cantHijos =cantHijos;
		this.antiguedad = antiguedad; 
	}
	public void setHijos(int numero) {
		this.cantHijos = numero;
	}
	public void setAntiguedad(int cantidad) {
		this.antiguedad = cantidad;
	}	
	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico() + this.sueldoFamiliar() + this.asignacionPorAntiguedad(); 
	}
	
	public float sueldoFamiliar() {
		return this.adicionalPorHijo(150) + this.asignacionPorConyuge();
	}
	public float asignacionPorConyuge() { 
		return (this.getEstadoCivil().equalsIgnoreCase("Casado")) ?100 :0  ;
	}
	public int adicionalPorHijo(int monto) {
		return monto * cantHijos ;
	}
	public int asignacionPorAntiguedad() {
		return antiguedad * 50;
	}
	
	@Override
	public float adicionales() {
		// TODO Auto-generated method stub
		return  this.adicionalPorHijo(20)   ;
	}
	@Override
	public float porcentajeDeAporteJubilatorio() {
		return this.sueldoBruto() * 0.10f;
	}

}
