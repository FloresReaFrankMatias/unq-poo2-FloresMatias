package ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Facturas;

import ar.edu.unq.poo2.tp5.Caja_MercadoCentral_v2.Agencia;

public class Servicios extends Factura {
	private int costoUnidad;
	private int cantidadUnidades;
	public Servicios(Agencia agencia, int costoUnidad, int cantidadUnidades) {
		super(agencia);
		this.costoUnidad = costoUnidad;
		this.cantidadUnidades = cantidadUnidades;
	}

	@Override
	public double getMontoAPagar() {
		return getCostoUnidad() * getCantidadUnidades();
	}

	public int getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(int costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

}
