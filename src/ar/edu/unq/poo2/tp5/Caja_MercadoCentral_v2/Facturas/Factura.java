package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Agencia;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Pagable;

public abstract class Factura implements Pagable{
	private Agencia agencia;
	public Factura(Agencia agencia) {
		super();
		this.agencia = agencia;
	}
	@Override
	public void registarPago() {
		this.agencia.registrarPago(this);
	}
	public abstract double getMontoAPagar();
}
