package ar.edu.unq.poo2.tpTemplateMethod;

public class EmpeladoPasante extends Empleado {
	private int horasTrabajadas;
	public EmpeladoPasante(int horasTrabajadas) {
		// TODO Auto-generated constructor stub
		this.horasTrabajadas=horasTrabajadas;
	}

	@Override
	public int sueldoBasico() {
		// TODO Auto-generated method stub
		return this.sueldoPorHora();
	}

	@Override
	public int sueldoAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sueldoPorHora() {
		// TODO Auto-generated method stub
		return 40 * this.horasTrabajadas;
	}

}
