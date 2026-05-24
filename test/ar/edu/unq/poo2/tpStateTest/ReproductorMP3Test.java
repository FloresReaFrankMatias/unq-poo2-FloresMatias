package ar.edu.unq.poo2.tpStateTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tpState.ReproductorMP3.EstadoPausado;
import ar.edu.unq.poo2.tpState.ReproductorMP3.EstadoReproduciendo;
import ar.edu.unq.poo2.tpState.ReproductorMP3.EstadoSeleccionando;
import ar.edu.unq.poo2.tpState.ReproductorMP3.ReproductorMP3;
import ar.edu.unq.poo2.tpState.ReproductorMP3.Song;

class ReproductorMP3Test {
	ReproductorMP3 mp3;
	Song song;
	
	@BeforeEach
	void setUp() throws Exception {
		song = new Song("Cancion1");
		mp3 = new ReproductorMP3(song);
		
	}

	@Test
	void testMP3EnEstadoSeleccionadoPasaAPlay() {
		mp3.play();
		assertEquals(EstadoReproduciendo.class , mp3.getState().getClass());
		
	}
	@Test
	void testMP3EnEstadoSeleccionadoPasoAPasuseYFalla() {
		assertThrows(RuntimeException.class, ()->mp3.pause());
	}
	@Test
	void testMP3DePauseAReproduciendo() {
		
		mp3.play();
		mp3.pause();
		assertEquals(EstadoPausado.class , mp3.getState().getClass());
	}
	@Test
	void testMP3DePauseAReproduciendoYFalla() {
		
		mp3.play();
		mp3.pause();
		assertThrows(RuntimeException.class, ()->mp3.play());
	}
	@Test
	void testMP3DeReproduciendoASeleccionando() {
		
		mp3.play();
		mp3.stop();
		assertEquals(EstadoSeleccionando.class, mp3.getState().getClass());
	}

}
