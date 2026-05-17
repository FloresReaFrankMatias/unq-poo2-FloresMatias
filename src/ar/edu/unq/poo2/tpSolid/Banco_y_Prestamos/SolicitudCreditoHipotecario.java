package ar.edu.unq.poo2.tpSolid.Banco_y_Prestamos;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private Propiedad propiedad;
	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		// TODO Auto-generated constructor stub
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable(Cliente cliente) {
		// TODO Auto-generated method stub
		return  this.cumpleMontoDeCuotaMensual(cliente) && this.cumpleValorFiscalDeGarantia(cliente) && this.cumpleEdadMaxima(cliente);
		
	}
	
	public boolean cumpleMontoDeCuotaMensual(Cliente cliente) {
		return   this.getCuotaMensual() <= cliente.getSueldoNetoMensual() * 0.5d;
		
	}
	
	public boolean cumpleValorFiscalDeGarantia(Cliente cliente) {
		return this.getMonto()  <= this.propiedad.getValorFiscal() * 0.7d; 
	}
	
	public boolean cumpleEdadMaxima(Cliente cliente) {
		return (cliente.getEdad() + this.getPlazo()/12) <= 65;
	}

}
