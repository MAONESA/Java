package juegos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wiki {
	void suma(int valor, int valor2) {
		int resultado = valor + valor2;
		System.out.println("El resultado de la suma es: "+resultado);
		
	}
	void rectangulo(int valor, int valor2) {
		int resultado = valor * valor2;
		System.out.println(resultado);
	}
	void prisma(int valor, int valor2, int valor3) {
		int resultado = valor * valor2 * valor3;
		System.out.println(resultado);
	}
	public Integer prismaVoluemn (int alto, int ancho, int largo) {
		int volumenPrisma = alto*ancho*largo;
		return volumenPrisma;
	}
	public Integer mayor(int valor, int valor2) {
		if (valor > valor2 ){
			return valor;
		}else if (valor2 > valor) {
			return valor2;
		} 
			return 1;
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Hola mundo");
		
		String nombre = "Juan";
		System.out.println(nombre);
		
		System.out.println("Hola"+nombre);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un nombre: ");
		String nombreIntroducido = br.readLine();
		System.out.println(nombreIntroducido);
		
		System.out.println("Introduzca un numero: ");
		String valorIntroducido1 = br.readLine();
		System.out.println("Introduzca un numero2: ");
		String valorIntroducido2 = br.readLine();
		
		int valor1 = Integer.parseInt(valorIntroducido1);
		int valor2 = Integer.parseInt(valorIntroducido2);
		int resultado = valor1 + valor2;
		System.out.println(resultado);
		
		Wiki i = new Wiki();
		i.suma(valor1, valor2);
		
		
		int valorRectangulo = 10;
		int valorRectangulo2 = 10;
		
		i.rectangulo (valorRectangulo,valorRectangulo2);
		
		int largo = 10;
		int alto = 5;
		int ancho = 3;
		i.prisma(largo,alto,ancho);
		
		int variable = i.prismaVoluemn(3,2,4);
		System.out.println(variable);
		
		int primerNumero = 10;
		int segundoNumero = 5;
		int imprimirUltimo = i.mayor(primerNumero, segundoNumero);
		System.out.println(imprimirUltimo);
		
		
	}
	
}
