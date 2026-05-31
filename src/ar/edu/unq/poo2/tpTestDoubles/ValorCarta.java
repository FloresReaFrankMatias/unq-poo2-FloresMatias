package ar.edu.unq.poo2.tpTestDoubles;

public enum ValorCarta {
	DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), 
    SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), 
    J(11), Q(12), R(13), A(14);

    private final int valor;

    ValorCarta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
