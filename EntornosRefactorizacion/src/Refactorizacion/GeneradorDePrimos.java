package Refactorizacion;

public class GeneradorDePrimos {
	/**
	 * Generar numeros primos de 1 a max
	 * @param max es el valor maximo
	 * @return Vector de numeros primos
	 */
	
	private static boolean esPrimo[];
	private static int primos[];
	
	  public static int[] generarPrimos(int max) {
		int i, j;
		
		if (max < 2) {
			// max < 2
			return new int[0]; // Vector vacío
		} else { 
			inicializarCandidatos(max);
			eliminarMultiplos();
			//obtenerCandidatosNoEliminados();
			return primos;
		}
		
	  }	
	
	  
	  private static void inicializarCandidatos(int max) {
			int i;
			
			esPrimo = new boolean [max+1];
			esPrimo[0] = esPrimo[1] = false;
			for (i=2; i<esPrimo.length;i++)
				esPrimo[i] = true;
			
	  }
		
	  
	  private static void eliminarMultiplos() {
		int i;
		
		for (i=2; i<maxFactor();i++)
			if(esPrimo[i])
				eliminarMultiplosDe(i);
		
	  }
	  
	  private static int maxFactor() {
		  
		  return (int) Math.sqrt(esPrimo.length) + 1;
	  }
	  
	  
	  private static void eliminarMultiplosDe (int i) {
		  int multiplo;
		  
		  for (multiplo=2*i;
			   multiplo<esPrimo.length;
			   multiplo+=i)
			  esPrimo[multiplo]=false;
	  }
				
}		
			
			