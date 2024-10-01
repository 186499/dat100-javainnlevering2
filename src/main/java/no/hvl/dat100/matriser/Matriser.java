package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print("{");
	    for (int[] rad : matrise) {
	        for (int element : rad) {
	            System.out.print(element + " ");
	        }
	    }
        System.out.println("}");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "";
	    for (int[] rad : matrise) {  
	        int count = 0; 
	        for (int element : rad) {  
	            resultat+= element; 
	            
	            count++; 
	            
	            if (count <= rad.length) {
	                resultat+= " ";
	            }
	        }
	        resultat+= "\n"; 
	    } 
	    return resultat;
	}
	    
	    
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        
        return nyMatrise;
    }


	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int radA = a.length;
		int radB = b.length;
		int kolonneA = a[0].length;
		int kolonneB = b[0].length;
		
		if (radA != radB || kolonneA != kolonneB) {
			return false;
		}
		
	    for (int i = 0; i < radA; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                return false;
				     }
		     }

	    }
	    return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
