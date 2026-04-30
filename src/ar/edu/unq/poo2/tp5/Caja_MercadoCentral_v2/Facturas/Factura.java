package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Agencia;
//import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Caja;
import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Cobrable;

public abstract class Factura implements Cobrable{
	private Agencia agencia;
	public Factura(Agencia agencia) {
		super();
		this.agencia = agencia;
	}
	
	public abstract double getMontoAPagar();
	public void registrarPago() {
		agencia.registrarPago(this);
	}
}
