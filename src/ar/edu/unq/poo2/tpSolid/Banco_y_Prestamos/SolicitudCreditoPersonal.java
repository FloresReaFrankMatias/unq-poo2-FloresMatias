package ar.edu.unq.poo2.tpSolid.Banco_y_Prestamos;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		super(cliente, monto, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esAceptable(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.superaIngresoMinimoAnual(cliente) && this.cumpleMontoDeCuotaMensual(cliente) ;
	}
	
	public boolean superaIngresoMinimoAnual(Cliente cliente) {
		return cliente.getSueldoNetoAnual() > 15000d;
	}
	
	public boolean cumpleMontoDeCuotaMensual(Cliente cliente) {
		return   this.getCuotaMensual() <= cliente.getSueldoNetoMensual() * 0.7d;
	}

}
