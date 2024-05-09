package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
	
	void suma(int valor, int valor2) {
		int resultado = valor + valor2;
		System.out.println("El resultado de la suma es: "+resultado);
		
	}
	void resta(int valor, int valor2) {
		int resultado = valor - valor2;
		System.out.println("El resultad de la resta es: "+resultado);
	}
	
	void multi(int valor, int valor2) {
		int resultado = valor * valor2;
		System.out.println("El resultado de la multiplicación es: "+resultado);
	}
	void divi(int valor, int valor2) {
		int resultado = valor / valor2;
		System.out.println("El resultado de la división es: "+resultado);
	}
		
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca primer valor: ");
	String primerValor = br.readLine();
	System.out.println("Introduzca segundo valor: ");
	String segundoValor = br.readLine();
	
	int valor1 = Integer.parseInt(primerValor);
	int valor2 = Integer.parseInt(segundoValor);
	
	System.out.println("Que operación quieres realizar: [+] [-] [*] [/]: ");
	String opcion = br.readLine();
	
	Calculadora i= new Calculadora();
	if(opcion.equals("+")) {
		i.suma(valor1,valor2);
	}else if(opcion.equals("-")){
		i.resta(valor1,valor2);
	}else if (opcion.equals("*")) {
		i.multi(valor1,valor2);
	}else if (opcion.equals("/")) {
		i.divi(valor1, valor2);
	}else {
		System.out.println("Marque una de las opciones de nuevo");
	}
	
}
}
