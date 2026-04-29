package ar.edu.unq.poo2.tp5.Caja_MercadoCentral;
import java.util.ArrayList;
import java.util.List;


public class Caja {
	private List<Producto> productos;
	
	public Caja() {
		this.productos = new ArrayList<Producto>();
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
