package ar.edu.unq.poo2.tp4.Trabajador;

public class IngresoHoraExtra extends Ingreso {
	private int cantHorasExtras;
	public IngresoHoraExtra(int mes, String concepto, Double monto, int cantHorasExtras) {
		super(mes, concepto, monto);
		this.cantHorasExtras = cantHorasExtras;
	}

	public int getHorasExtras() {
		return cantHorasExtras;
	}	
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
