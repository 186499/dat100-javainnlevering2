package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		
		for (int i=0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
	    // Start med å bygge strengen, begynn med [
	    String resultat = "[";

	    // Legg til hvert element i tabellen
	    for (int i = 0; i < tabell.length; i++) {
	        resultat += tabell[i]; // Legg til tallet
	        
	        // Legg til komma hvis det ikke er det siste elementet
	        if (i < tabell.length - 1) {
	            resultat += ",";
	        }
	    }

	    // Avslutt med ]
	    resultat += "]";

	    return resultat;
	}
    

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i = 0; i<tabell.length; i++) {
			
			if (tabell[i] == tall) {
				return true;
			} 
			
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
			
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// Opprett en ny tabell med samme størrelse som den originale
        int[] reversertTabell = new int[tabell.length];
        
        // Fyll den nye tabellen med elementene fra den originale i omvendt rekkefølge
        for (int i = 0; i < tabell.length; i++) {
            reversertTabell[i] = tabell[tabell.length - 1 - i];
        }
        
        // Returner den reverserte tabellen
        return reversertTabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
        // Sjekk om tabellen har 0 eller 1 elementer
        if (tabell.length <= 1) {
            return true; // En tom tabell eller en med ett element er sortert
        }

        // Iterer gjennom tabellen fra 0 til length - 2
        for (int i = 0; i < tabell.length - 1; i++) {
            // Sjekk om det nåværende elementet er større enn det neste
            if (tabell[i] > tabell[i + 1]) {
                return false; // Hvis det er tilfelle, er tabellen ikke sortert
            }
        }

        return true; 
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int length = tabell1.length + tabell2.length;
		int[] sammensattTabell = new int[length];
		
        for (int i = 0; i < tabell1.length; i++) {
        	sammensattTabell[i] = tabell1[i];
        }
        
        for (int i = 0; i < tabell2.length; i++) {
        	sammensattTabell[tabell1.length + i] = tabell2[i];
        }
        return sammensattTabell;
	}
	
}
