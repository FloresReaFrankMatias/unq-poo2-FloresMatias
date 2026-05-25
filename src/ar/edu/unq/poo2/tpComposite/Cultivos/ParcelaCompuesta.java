package ar.edu.unq.poo2.tpComposite.Cultivos;

import java.util.ArrayList;
import java.util.List;
public class ParcelaCompuesta implements Parcela {
	private List <Parcela> parcelas;
	public ParcelaCompuesta() {
		 this.parcelas = new ArrayList<Parcela>();
	}

	@Override
	public int gananciaAnual() {
		// TODO Auto-generated method stub
		
		int gananciaTotal =  parcelas.stream()
		                             .mapToInt( parcelas -> parcelas.gananciaAnual())
		                             .sum();
		return gananciaTotal / 4;
		
	}
	public void addParcela(Parcela parcela) {
		this.puedeAgregar(parcela);
		parcelas.add(parcela);
	}
	public void puedeAgregar(Parcela parcela) {
		if(parcelas.size() >= 4) {
			throw new RuntimeException("No se pueden agregar mas parcelas a esta parcela compuesta");
		}
	}
	
	public void deleteParcela(Parcela parcela) {
		this.puedeEliminar(parcela);
		parcelas.remove(parcela);
	}
	public void puedeEliminar(Parcela parcela) {
		if(!parcelas.contains(parcela)) {
			throw new RuntimeException("No se pueden eliminar parcelas que no existen en esta parcela compuesta");
		}
	}
	

}
