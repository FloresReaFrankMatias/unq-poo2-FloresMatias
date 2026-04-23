package ar.edu.unq.poo2.tp4.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	public Double getPrecioTotal() {
		Double precioTotal = 0d;
		for(Producto p: productos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
	

}
