package ar.edu.unq.poo2.tpState.Videojuego;

public class EstadoMVGSinFichas extends EstadoMaquinaVG {

	

	@Override
	public void iniciarJuego(MaquinaVG maquina) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede iniciar el juego sin fichas");
		
	}

	@Override
	public void ingresarFicha(MaquinaVG maquina) {
		maquina.setEstado(new EstadoMVG1Ficha());
		
	}

}
