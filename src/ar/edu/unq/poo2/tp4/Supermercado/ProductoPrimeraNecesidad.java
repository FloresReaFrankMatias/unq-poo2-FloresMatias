package ar.edu.unq.poo2.tp4.Supermercado;

public class ProductoPrimeraNecesidad {
	private String nombre;
	private Double precio;
	private boolean precioCuidado ;

	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio * 0.9;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	
}
