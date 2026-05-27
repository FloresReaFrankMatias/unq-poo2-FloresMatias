package ar.edu.unq.poo2.tpTemplateMethod;

public class EmpleadoPlanta extends Empleado {
	private int cantHijos;
	public EmpleadoPlanta(int cantHijos) {
		// TODO Auto-generated constructor stub
		this.cantHijos=cantHijos;
	}

	@Override
	public int sueldoBasico() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	public int sueldoAdicional() {
		// TODO Auto-generated method stub
		return cantHijos * 150;
	}

	@Override
	public int sueldoPorHora() {
		// TODO Auto-generated method stub
		return 0;
	}

}
