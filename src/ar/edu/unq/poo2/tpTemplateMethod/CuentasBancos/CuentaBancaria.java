package ar.edu.unq.poo2.tpTemplateMethod.CuentasBancos;

import java.util.ArrayList;
import java.util.List;
public abstract class CuentaBancaria {
		private String titular;
		private int saldo;
		private List<String> movimientos;
		
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	}
	public String getTitular(){
		return this.titular;
	}
	public int getSaldo(){
		return this.saldo;
	 }
	protected void setSaldo(int monto){
		this.saldo=monto;
	 }
	 public void agregarMovimientos(String movimiento){
		 this.movimientos.add(movimiento);
	 }
	 public final void extraer(int monto) {
		 //este es el template method
		 if(this.puedeExtraer(monto)){
			 this.setSaldo(this.getSaldo()-monto);
			 this.agregarMovimientos("Extraccion");
			 }
	 }
	 // metodo hooks
	 public abstract boolean puedeExtraer(int monto);
	
}
