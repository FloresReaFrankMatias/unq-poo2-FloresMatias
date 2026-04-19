package ar.edu.unq.poo2.tp3;

public class Desarmador {

	public Desarmador() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumeroConMasDigitosPares(int[] numbers) {
        int numeroConMasPares = 0;
        int maxEvenCount = -1;

        for (int number : numbers) {
            int numParesActual = this.countEvenDigits(number);
            if (numParesActual > maxEvenCount) {
                maxEvenCount = numParesActual;
                numeroConMasPares = number;
            }
        }
        return numeroConMasPares;
    }

    
    private int countEvenDigits(int number) {
    	int cantDePares = 0;

        if (number == 0) {
            return 1;
        }

     
        while (number > 0) {
            int ultimoDigito = number % 10;
            
            if (ultimoDigito % 2 == 0) {   
            	cantDePares++;                
            }
            
            number = number / 10;        
        }
     
        return cantDePares;
    }
}

