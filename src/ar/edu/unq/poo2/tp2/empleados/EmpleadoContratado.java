package ar.edu.unq.poo2.tp2.empleados;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	private int numeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, LocalDate fechaNacimiento, float sueldoBasico,
			String estadoCivil, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, fechaNacimiento, sueldoBasico, estadoCivil);
		this.setMedioDePago(medioDePago);
		this.setNumeroDeContrato(numeroDeContrato);
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(int numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public float adicionales() {
		return this.gastosAdministractivos();
	}
	public int gastosAdministractivos() {
		return 50;
	}

	@Override
	public float porcentajeDeAporteJubilatorio() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
