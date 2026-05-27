package ar.edu.unq.poo2.tpTemplateMethod.CuentasBancos;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite=limite;
		// TODO Auto-generated constructor stub
	}
	public int getLimite() {
		return limite;
	}
	@Override
	public boolean puedeExtraer(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo()>=monto && monto<=this.getLimite();
	}
}
