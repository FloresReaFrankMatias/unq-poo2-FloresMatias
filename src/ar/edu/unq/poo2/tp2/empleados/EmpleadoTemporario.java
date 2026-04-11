package ar.edu.unq.poo2.tp2.empleados;

import java.time.LocalDate;

public  class EmpleadoTemporario extends Empleado {
	private int cantHorasExtras;
	private LocalDate fechaFinContrato;
	public EmpleadoTemporario(String nombre, String direccion, LocalDate fechaNacimiento, float sueldoBasico,
			String estadoCivil, int cantHorasExtras, LocalDate fechaFinContrato) {
		super(nombre, direccion, fechaNacimiento, sueldoBasico, estadoCivil);
	}
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}


	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}


	public LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}


	public void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	
	@Override
	public float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.adicionalPorHorasExtras(40) ;
	}
	public int adicionalPorHorasExtras(int monto) {
		return monto * this.getCantHorasExtras();
	}
	
	@Override
	public float adicionales() {
		// TODO Auto-generated method stub
		return this.adicionalPorEdad() + this.adicionalPorHorasExtras(5);
	}
	public int adicionalPorEdad() {
		return (this.getEdad() > 50)? 25 : 0;
	}
	@Override
	public float porcentajeDeAporteJubilatorio() {
		// TODO Auto-generated method stub
		return this.sueldoBruto() * 0.15f;

	}
	@Override
	public String desgloseConceptos() {
	    return super.desgloseConceptos() + 
	           "\nHoras Extras: $" + (this.adicionalPorHorasExtras(5)) +
	           "\n Retencion por antiguedad: $" + (this.adicionalPorEdad() ) +
	           "\n Retencion por hora extra: $" + (this.adicionalPorHorasExtras(5) );
	}


}
