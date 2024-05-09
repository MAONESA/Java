package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos4 {
	public String testLogicalOr(int val) {
		  if (val >= 10 && val<=20 ) { // Cambia esta línea
		    return "Inside";
		  }else {
		    return "Outside";
		  }
		}
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un valor: ");
	String valorIntroducido = br.readLine();
	int valor = Integer.parseInt(valorIntroducido);
	Booleanos4 i = new Booleanos4();
	String numeros = i.testLogicalOr(valor);
	System.out.println(numeros);
}
}
