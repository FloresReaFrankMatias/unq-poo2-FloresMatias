package ar.edu.unq.poo2.tpTemplateMethod;

public abstract class Empleado {

	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	public abstract int sueldoBasico();
	public abstract int sueldoAdicional();
	public abstract int sueldoPorHora();
	public final int sueldo() {
	 return (this.sueldoBasico() + this.sueldoPorHora()+ this.sueldoAdicional()) - this.descuentoConceptos();	
	}
	public int descuentoConceptos() {
		return (int) (this.sueldoBasico() * 0.13);
	}

}
