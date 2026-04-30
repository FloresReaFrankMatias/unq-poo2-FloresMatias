package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas.Factura;

public class AgenciaDePrueba implements Agencia {
	private double montoPagosRegistrados;
	private int pagosRegistrados;
	
	public AgenciaDePrueba(double montoPagosRegistrados,int pagosRegistrados) {
		// TODO Auto-generated constructor stub
		this.montoPagosRegistrados = montoPagosRegistrados;
		this.pagosRegistrados=pagosRegistrados;
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		montoPagosRegistrados += factura.getMontoAPagar();
		pagosRegistrados++;

	}
	public int getPagosRegistrados() {
		return pagosRegistrados;
	}
	public double getMontoPagosRegistrados() {
		return montoPagosRegistrados;
	}

}
