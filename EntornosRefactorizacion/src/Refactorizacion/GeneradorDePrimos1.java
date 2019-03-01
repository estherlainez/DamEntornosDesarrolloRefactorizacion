package Refactorizacion;

public class GeneradorDePrimos1 {
	

	private boolean esPrimo[];
	private  int primos[];
	
	
	
	  public int[] generarPrimos(int max) {
		int i, j;
		
		if (max < 2) {
			// max < 2
			return new int[0]; // Vector vacío
		} else { 
			inicializarCandidatos(max);
			eliminarMultiplos();
			obtenerCandidatosNoEliminados();
			return primos;
		}
		
	  }	
	
	  
	  private  void inicializarCandidatos(int max) {
			int i;
			
			this.esPrimo = new boolean [max+1];
			this.esPrimo[0] = this.esPrimo[1] = false;
			for (i=2; i<esPrimo.length;i++)
				this.esPrimo[i] = true;
			
	  }
		
	  
	  private  void eliminarMultiplos() {
		int i;
		
		for (i=2; i<maxFactor();i++)
			if(this.esPrimo[i])
				eliminarMultiplosDe(i);
		
	  }
	  
	  private  int maxFactor() {
		  
		  return (int) Math.sqrt(this.esPrimo.length) + 1;
	  }
	  
	  



	private  void eliminarMultiplosDe (int i) {
		  int multiplo;
		  
		  for (multiplo=2*i;
			   multiplo<this.esPrimo.length;
			   multiplo+=i)
			  this.esPrimo[multiplo]=false;
	  }
				
	  private  void obtenerCandidatosNoEliminados() {
		  int i, j, cuenta;
		  cuenta=0;
		  for (i=0; i<esPrimo.length; i++)
			  if (this.esPrimo[i])
				  cuenta++;
		  
		  primos = new int [cuenta];
		  for (i=0,j=0;i<esPrimo.length;i++)
			  if(this.esPrimo[i])
				  primos[j++] = i;
	  }
}
