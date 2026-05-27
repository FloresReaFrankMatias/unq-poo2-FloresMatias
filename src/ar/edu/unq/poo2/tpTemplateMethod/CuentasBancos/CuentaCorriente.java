package ar.edu.unq.poo2.tpTemplateMethod.CuentasBancos;

public class CuentaCorriente extends CuentaBancaria {
		private int descubierto ;
	public CuentaCorriente(String titular,int descubierto ) {
		super(titular);
		this.descubierto=descubierto;
		// TODO Auto-generated constructor stub
	}
	public int getDescubierto() {
		return descubierto;
	}

	@Override
	public boolean puedeExtraer(int monto) {
		// TODO Auto-generated method stub
		return (this.getSaldo()+this.getDescubierto()) >= monto;
	}

}
