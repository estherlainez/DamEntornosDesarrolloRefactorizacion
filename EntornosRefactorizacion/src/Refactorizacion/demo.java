package Refactorizacion;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primos[];
		int limite = 125;
		primos = GeneraPrimos.generarPrimos(limite);
		
		System.out.println("Lista de n�meros primos entre 0 y "+limite);
		for (int i=0; i<primos.length; i++) {
			System.out.println(primos[i]);
		}
	}

}