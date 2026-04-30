package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2;

import java.util.ArrayList;
import java.util.List;

//import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas.Factura;
//import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Producto.*;

public class Caja {

	private List<Cobrable> cobrables;
	public Caja() {
		this.cobrables = new ArrayList<Cobrable>();
	}
	
	public void registrarItem(Cobrable c) {
		cobrables.add(c);
		c.registrarPago();
	}
//	
//	public void registrarProducto(Producto p) {
//		validarRegistro(p);
//		cobrables.add(p);
//		p.decrementarStock();
//	}
//	
//	public void validarRegistro(Producto producto) {
//		if(!producto.hayStock()) {
//			throw new IllegalArgumentException("El producto no tiene stock");
//		}
//	}
//	
	public double montoTotalAPagar() {
		return cobrables.stream()
				        .mapToDouble(p -> p.getMontoAPagar()) //esto se qyeda con el precio de cada producto
				        .sum();
	}

}
