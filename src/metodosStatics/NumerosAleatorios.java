package metodosStatics;

public class NumerosAleatorios {
	public static void main(String[] args) {
		//1.
		int MAX = 7;
		int MIN = 5;
		System.out.println(Math.floor(Math.random() * (MAX - MIN + 1)) + MIN);
		//2.
		String nombre = "David";
		int longitudNombre = nombre.length()-1;
		
		double numeroAleatorio = Math.floor(Math.random() * (longitudNombre - 1 + 1)) + 1;
		
		String resultado = nombre.substring((int) numeroAleatorio,(int) numeroAleatorio+1);
		System.out.println(resultado);
		
	}

}
