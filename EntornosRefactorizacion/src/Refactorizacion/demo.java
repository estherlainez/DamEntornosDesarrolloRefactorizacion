package Refactorizacion;

public class demo {
/**
 * @param mostramos las dos maneras de hacerlo pudiendo llamar a las dos clases,
 * la que se pone como ejemplo con static, la mia sin static  y la final sin static
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int primos[];
			int limite = 125;
			//para hacerlo sin static me creo un objeto
			GeneradorDePrimos1  a= new GeneradorDePrimos1();
			VersionFinal b = new VersionFinal(limite);
			//primos = a.generarPrimos(limite);
			primos = b.getPrimos();
			//De esta manera se llamaria a la clase con los metodos static
			//primos =GeneradorDePrimos.generarPrimos(limite);
			
			System.out.println("Lista de números primos entre 0 y "+limite);
			for (int i=0; i<primos.length; i++) {
				System.out.println(primos[i]);
			}
			
	}

}