package ar.edu.unq.poo2.tpStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StrategyCambiarOrden implements EncryptingStrategy {

	public StrategyCambiarOrden() {
		// TODO Auto-generated constructor stub
	}

	// Como el proceso de dar vuelta las palabras es idéntico para ambos lados,
    // creamos un método privado auxiliar para no repetir código.
    private String invertirPalabras(String txt) {
        if (txt == null || txt.isEmpty()) return "";

        // 1. Rompemos el texto en un array de palabras usando el espacio como separador
        String[] palabrasArray = txt.split(" ");
        
        // 2. Lo convertimos a una lista para poder usar las herramientas de Collections
        List<String> palabrasLista = Arrays.asList(palabrasArray);
        
        // 3. Invertimos el orden de la lista físicamente
        Collections.reverse(palabrasLista);
        
        // 4. Usamos Streams para unir las palabras separadas por un espacio de nuevo
        return palabrasLista.stream()
                .collect(Collectors.joining(" "));
    }

    @Override
    public String encriptar(String txt) {
        return this.invertirPalabras(txt);
    }

    @Override
    public String desencriptar(String txt) {
        return this.invertirPalabras(txt);
    }

}
