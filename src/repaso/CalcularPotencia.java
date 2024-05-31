package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularPotencia {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduce la base: ");
	String valor1 = br.readLine();
	System.out.println("Introduce el exponente: ");
	String valor2 = br.readLine();
	
	int base = Integer.parseInt(valor1);
	int exponente = Integer.parseInt(valor2);
	int resultado = 1;
	
	for(int i = 0; i < exponente; i++) {
		resultado = resultado * base;
	}
	System.out.println(resultado);

}
}
