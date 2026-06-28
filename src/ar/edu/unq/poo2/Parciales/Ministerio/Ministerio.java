package ar.edu.unq.poo2.Parciales.Ministerio;

import java.util.List;

public class Ministerio  {

	public Ministerio() {
		// TODO Auto-generated constructor stub
	}
	public float montoTotalAInvertir(List<Secretaria> secretarias) {
        float total = 0;
        for (Secretaria secretaria : secretarias) {
            total += secretaria.montoTotal();
        }
        return total;
    }

}
