package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Agencia;

public class Impuesto extends Factura {
	private int tasaDeServicio;
	public Impuesto(Agencia agencia, int tasaDeServicio) {
		super(agencia);
		this.tasaDeServicio = tasaDeServicio;
	}

	public int getTasaDeServicio() {
		return tasaDeServicio;
	}
	@Override
	public double getMontoAPagar() {
		// TODO Auto-generated method stub
		return getTasaDeServicio();
	}

}
