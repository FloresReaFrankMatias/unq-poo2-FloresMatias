package ar.edu.unq.poo2.tpComposite.Cultivos;

public class ParcelaComun implements Parcela {
	private TipoCultivo cultivo;
	public ParcelaComun(TipoCultivo tipoCultivo) {
		// TODO Auto-generated constructor stub
		this.cultivo = tipoCultivo;
	}

	@Override
	public int gananciaAnual( ) {
		// TODO Auto-generated method stub
		return cultivo.getValorGananciaAnual();
	}

}
