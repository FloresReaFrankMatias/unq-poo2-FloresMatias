package ar.edu.unq.poo2.tpComposite.JuegoDeEstrategia;

public class Ingeniero implements Personaje {
	private int lajas;

    public Ingeniero(int lajasIniciales) {
        this.lajas = lajasIniciales;
    }

    @Override
    public void caminar(Casillero destino) {
    	if (this.lajas < 1) {
            this.avanzarNormal(destino);
        } else {
            this.avanzarConstruyendo(destino);
        }
    }

    private void avanzarNormal(Casillero destino) {
        // Lógica para caminar de la forma más corta posible
        System.out.println("Ingeniero camina directo a " + destino.getCoordenadas());
    }

    private void avanzarConstruyendo(Casillero destino) {
        // Camina directo, pone la laja y decrementa su bolsa
        System.out.println("Ingeniero camina directo a " + destino.getCoordenadas() + " dejando lajas.");
        this.ponerLaja(destino);
        this.lajas--;
    }

    private void ponerLaja(Casillero destino) {
        this.lajas--;
        destino.ponerLaja();
    }

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub

	}

}
