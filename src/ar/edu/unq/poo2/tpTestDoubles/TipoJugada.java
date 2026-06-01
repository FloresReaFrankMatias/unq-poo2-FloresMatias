package ar.edu.unq.poo2.tpTestDoubles;

public enum TipoJugada  {
	POKER(3), COLOR(2), TRIO(1), NADA(0);


	private int prioridad;
	TipoJugada(int prioridad) {
        this.prioridad = prioridad;
    }
	public int getPrioridad() {
		return prioridad;
	}
	

}
