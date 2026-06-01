package ar.edu.unq.poo2.tpTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class tpTestDoublesTest {
	private PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	
	private Jugada jugada1;
	private Jugada jugada2;
	
	@BeforeEach
	void setUp() {
		//Test Double Installation
		pokerStatus = new PokerStatus();
		
		// Setup
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		
		jugada1 = mock(Jugada.class);
		jugada2 = mock(Jugada.class);
	}
	
	@Test
	void testJugada1LeGanaAJugada2() {
		// Test Double Configuration
		when(jugada1.leGanaA(jugada2)).thenReturn(true);
				
		assertTrue(jugada1.leGanaA(jugada2));
		verify(jugada1).leGanaA(jugada2);
		
	}
	
	@Test
	void testJugada2LeGanaAJugada1() {
		// Test Double Configuration
		when(jugada1.leGanaA(jugada2)).thenReturn(false);
		
		// Exercise & Verify
		assertFalse(jugada2.leGanaA(jugada1));
		verify(jugada2).leGanaA(jugada1);
	}

	@Test
	void testPoquerLeGanaAColor() {
		// Setup
		Jugada poquer = new Jugada(TipoJugada.POKER, ValorCarta.DOS);
        Jugada color = new Jugada(TipoJugada.COLOR, ValorCarta.A);
		
		// Exercise & Verify
		assertTrue(poquer.leGanaA(color));
	}
	
    @Test
    public void testColorNoLeGanaAPoquer() {
    	// Setup
        Jugada color = new Jugada(TipoJugada.COLOR, ValorCarta.A);
        Jugada poquer = new Jugada(TipoJugada.POKER, ValorCarta.DOS);
        
        // Exercise & Verify
        assertFalse(color.leGanaA(poquer));
    }
    
    @Test
    public void testTrioLeGanaANada() {
    	// Setup
        Jugada trio = new Jugada(TipoJugada.TRIO, ValorCarta.Q);
        Jugada nada = new Jugada(TipoJugada.NADA, ValorCarta.A);
        
        // Exercise & Verify
        assertTrue(trio.leGanaA(nada));
    }

    @Test
    public void testJugadaMismoTipoMayorValorGana() {
    	// Setup
        Jugada colorA = new Jugada(TipoJugada.COLOR, ValorCarta.R);
        Jugada colorB = new Jugada(TipoJugada.COLOR, ValorCarta.Q);
        
        // Exercise & Verify
        assertTrue(colorA.leGanaA(colorB));
        assertFalse(colorB.leGanaA(colorA));
    }

    @Test
    public void testJugadaMismoTipoMismoValorNoGana() {
    	// Setup
        Jugada colorA = new Jugada(TipoJugada.COLOR, ValorCarta.J);
        Jugada colorB = new Jugada(TipoJugada.COLOR, ValorCarta.J);
        
        // Exercise & Verify
        assertFalse(colorA.leGanaA(colorB));
        assertFalse(colorB.leGanaA(colorA));
    }
	
	@Test
	void testCartaConValorMayorAOtra() {
		// Test Double Configuration
        when(carta1.getValor()).thenReturn(ValorCarta.R);
        when(carta1.getPalo()).thenReturn(Palo.DIAMANTE);
		
        when(carta2.getValor()).thenReturn(ValorCarta.DOS );
        when(carta2.getPalo()).thenReturn(Palo.CORAZONES);
        
		// Exercise & Verify
		//pokerStatus.esValorDeMayorQue(carta1, carta2);
	}
	
	@Test
	void testCartaMismoPalo() {
		// Test Double Configuration
		when(carta1.getValor()).thenReturn(ValorCarta.DOS);
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE);

		when(carta2.getValor()).thenReturn(ValorCarta.TRES);
        when(carta2.getPalo()).thenReturn(Palo.CORAZONES);

		// Exercise & Verify
		//pokerStatus.esValorDeMayorQue(carta1, carta2);
	}

}
