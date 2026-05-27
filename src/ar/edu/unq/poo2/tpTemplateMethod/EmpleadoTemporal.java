package ar.edu.unq.poo2.tpTemplateMethod;

public class EmpleadoTemporal extends Empleado {
	private boolean estaCasado;
	private boolean tieneHijos;
	private int horasTrabajadas;
	public EmpleadoTemporal(boolean estaCasado, boolean tieneHijos, int horasTrabajadas) {
		// TODO Auto-generated constructor stub
		this.estaCasado = estaCasado;
		this.tieneHijos = tieneHijos;
		this.horasTrabajadas = horasTrabajadas;
	}
	public boolean getEstaCasado() {
		return estaCasado;
	}
	public boolean getTienehijos() {
		return tieneHijos;
	}

	@Override
	public int sueldoBasico() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int sueldoAdicional() {
		// TODO Auto-generated method stub
		return (this.getEstaCasado() || this.getTienehijos() )? 100 : 0;
	}

	@Override
	public int sueldoPorHora() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * 40;
	}

}
