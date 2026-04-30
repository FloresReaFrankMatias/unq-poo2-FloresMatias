package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Producto;

public class ProductoCooperativo extends Producto {

	public ProductoCooperativo(double precioBase, int stock) {
		super(precioBase, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0.10;
	}

}
