package ar.edu.unq.poo2.tpTestDoubles;

public  class Jugada  {
	private TipoJugada tipoJugada;
	private ValorCarta valorPrincipal;

    public Jugada(TipoJugada tipoJugada, ValorCarta valorPrincipal ) {
    	this.tipoJugada = tipoJugada;
        this.valorPrincipal = valorPrincipal;
    }

   
    


	
    
    
    public ValorCarta valorPrincipal() {
        return valorPrincipal;
    }
    public TipoJugada getTipoJugada() {
    	return tipoJugada;
    }

    
    public boolean leGanaA( Jugada j2) {
        if(this.tipoJugada.getPrioridad() == j2.tipoJugada.getPrioridad() ) {
            return this.valorPrincipal.getValor() > j2.valorPrincipal.getValor();
        }

        return this.tipoJugada.getPrioridad() > j2.tipoJugada.getPrioridad();
    }

}
