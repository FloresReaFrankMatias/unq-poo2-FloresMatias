package ar.edu.unq.poo2.tp5.Caja_MercadoCentral;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precioBase, int stock) {
		super(precioBase, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0.10;
	}

}
