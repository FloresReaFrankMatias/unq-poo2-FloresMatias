package ar.edu.unq.poo2.tp4.Trabajador;

public class Ingreso extends Trabajador {
	private int mes;
	private String concepto;
	private Double monto;
	public Ingreso(int mes, String concepto, Double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	public int getMes() {
		return mes;
	}
	public String getConcepto() {
		return concepto;
	}
	
	public double getMonto() {
		return monto;
	}
	public double getMontoImponible() {
		return this.getMonto();
	}

}
