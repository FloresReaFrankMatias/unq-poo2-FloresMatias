package ar.edu.unq.poo2.tpState.Videojuego;

public class EstadoMVG2Fichas extends EstadoMaquinaVG {

	
	@Override
	public void iniciarJuego(MaquinaVG maquina) {
		// TODO Auto-generated method stub
		System.out.println("Se inicia el juego con dos fichas para dos jugadores");
		
	}

	@Override
	public void ingresarFicha(MaquinaVG maquina) {
		// TODO Auto-generated method stub
		maquina.setEstado(new EstadoMVGSinFichas());
		
	}

}
