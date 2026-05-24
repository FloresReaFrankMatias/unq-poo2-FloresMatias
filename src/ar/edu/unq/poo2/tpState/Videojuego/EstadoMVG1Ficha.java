package ar.edu.unq.poo2.tpState.Videojuego;

public class EstadoMVG1Ficha extends EstadoMaquinaVG {



	@Override
	public void iniciarJuego(MaquinaVG maquina) {
		// TODO Auto-generated method stub
		System.out.println("Se inicia el juego con una sola ficha para un jugador");
		
	}

	@Override
	public void ingresarFicha(MaquinaVG maquina) {
		// TODO Auto-generated method stub
		maquina.setEstado(new EstadoMVG2Fichas());
		
	}

}
