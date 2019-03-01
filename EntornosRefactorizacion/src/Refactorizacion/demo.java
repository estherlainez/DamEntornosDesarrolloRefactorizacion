package Refactorizacion;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int primos[];
			int limite = 125;
			GeneradorDePrimos1  a= new GeneradorDePrimos1();
			primos = a.generarPrimos(limite);
			
			System.out.println("Lista de números primos entre 0 y "+limite);
			for (int i=0; i<primos.length; i++) {
				System.out.println(primos[i]);
			}
			
	}

}