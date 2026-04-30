package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Agencia;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Cobrable;

public abstract class Factura implements Cobrable{
	private Agencia agencia;
	public Factura(Agencia agencia) {
		super();
		this.agencia = agencia;
	}
	@Override
	public void registarPago() {
		agencia.registrarPago(this);
	}
	public abstract double getMontoAPagar();
}
