package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Producto;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Pagable;

public abstract class Producto implements Pagable {
	private double precioBase;
	private int stock;
	public Producto( double precioBase, int stock) {
		super();
		this.precioBase = precioBase;
		this.stock = stock;
	}

	

	

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecio(double precio) {
		this.precioBase = precio;
	}

	public int getStock() {
		return stock;
	}

	public boolean hayStock() {
		return this.getStock() > 0;
	}
	public void decrementarStock() {
		this.stock--;
	}
	public void registarPago() {
		this.decrementarStock();
	}
	
	public double getMontoAPagar() {
		return this.getPrecioBase() * (1 - this.descuento());
	} 
	
	public abstract double  descuento() ;

}
