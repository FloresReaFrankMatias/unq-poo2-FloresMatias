package ar.edu.unq.poo2.tp4.Supermercado;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean precioCuidado ;
	public Producto(String nombre, Double precio, boolean precioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
		public boolean isPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	public void aumentarPrecio(Double cantAAumentar ) {
		precio = precio + cantAAumentar;
	}
	

}
