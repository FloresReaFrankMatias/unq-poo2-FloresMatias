package ar.edu.unq.poo2.tpTestDoubles;

public abstract class JugadaBase implements Jugada {

	private ValorCarta valorPrincipal;

    public JugadaBase(ValorCarta valorPrincipal) {
        this.valorPrincipal = valorPrincipal;
    }

    @Override
    public ValorCarta valorPrincipal() {
        return valorPrincipal;
    }

    @Override
    public boolean leGanaA(Jugada otra) {

        if(this.prioridad() != otra.prioridad()) {
            return this.prioridad() > otra.prioridad();
        }

        return valorPrincipal.getValor() >
               otra.valorPrincipal().getValor();
    }

}
