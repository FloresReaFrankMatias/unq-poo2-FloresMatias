package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral.Producto;

public class Caja {

private List<Cobrable> cobrables;
	
	public Caja() {
		this.cobrables = new ArrayList<Cobrable>();
	}
	
	public void registrarProducto(Producto producto) {
		this.validarRegistro(producto);
		productos.add(producto);
		producto.decrementarStock();
	}
	public void validarRegistro(Producto producto) {
		if(!producto.hayStock()) {
			throw new IllegalArgumentException("El producto no tiene stock");
		}
	}
	
	public double montoTotalAPagar() {
		return productos.stream()
				        .mapToDouble(p -> p.montoTotal()) //esto se qyeda con el precio de cada producto
				        .sum();
	}

}
