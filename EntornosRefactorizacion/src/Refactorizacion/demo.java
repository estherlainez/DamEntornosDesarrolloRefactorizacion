package Refactorizacion;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int primos[];
			int limite = 125;
			primos = GeneradorDePrimos.generarPrimos(limite);
			
			System.out.println("Lista de números primos entre 0 y "+limite);
			for (int i=0; i<primos.length; i++) {
				System.out.println(primos[i]);
			}
			
			}catch(NullPointerException e) {
				System.out.println("esto no esta funcionando...");
			}
	}

}