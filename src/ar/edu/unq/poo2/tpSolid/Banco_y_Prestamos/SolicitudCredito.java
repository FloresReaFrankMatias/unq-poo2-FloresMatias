package ar.edu.unq.poo2.tpSolid.Banco_y_Prestamos;

public abstract class SolicitudCredito extends Banco {
	private Cliente cliente;
	private Double monto;
	private int plazo;
	
	public SolicitudCredito(Cliente cliente,Double monto,  int plazo) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}
	public double getMonto() {
		// TODO Auto-generated method stub
		return monto;
	}
	
	public Double getCuotaMensual() {
		return monto/plazo;
	}
	
	public abstract boolean esAceptable(Cliente cliente);

}
