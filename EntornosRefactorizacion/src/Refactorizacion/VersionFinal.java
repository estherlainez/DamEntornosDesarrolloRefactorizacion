package Refactorizacion;

public class VersionFinal{
 private boolean esPrimo[];
 private int primos[];

 public VersionFinal (int max){
	 if (max < 2) {
	 primos = new int[0]; // Vector vacío
	 } else {
		 inicializarCandidatos(max);
		 eliminarMultiplos();
		 obtenerCandidatosNoEliminados();
	 	}
 }
 
 
 public int[] getPrimos (){
	 return primos;
 }
 
 
 private void inicializarCandidatos (int max){
	 int i;
	 esPrimo = new boolean[max+1];
	 esPrimo[0] = esPrimo[1] = false;
	
	 for (i=2; i<esPrimo.length; i++)
		 esPrimo[i] = true;
 }
 
 
 private void eliminarMultiplos (){
	 int i;
	 for (i=2; i<maxFactorPrimo(); i++)
		 if (esPrimo[i])
			 eliminarMultiplosDe(i);
 }

 
 private int maxFactorPrimo () {
	 
	 return (int) Math.sqrt(esPrimo.length) + 1;
 }
 
 
 private void eliminarMultiplosDe (int i) {
	 int multiplo;
	 for ( multiplo=2*i; multiplo<esPrimo.length; multiplo+=i )
	    esPrimo[multiplo] = false;
 }
 
 
 private void obtenerCandidatosNoEliminados (){
	 int i, j;
	 primos = new int[numPrimos()];
	 for (i=0, j=0; i<esPrimo.length; i++) {
		 if (esPrimo[i])
			 primos[j++] = i;
	 }
 }
 
 
 private int numPrimos (){
	 int i;
	 int cuenta = 0;
	 for (i=0; i<esPrimo.length; i++) {
		 if (esPrimo[i])
			 cuenta++;
	 }
 return cuenta;
 }
 
}