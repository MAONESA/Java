package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos {
	public String testGreaterThan(int val) {
		  if (val > 100 ) {  // Cambia esta línea
		    return "Por encima de 100";
		  }

		  if (val >10) {  // Cambia esta línea
		    return "Por encima de 10";
		  }

		  return "10 o menos";
		}
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un valor: ");
	String valorIntroducido = br.readLine();
	int valor = Integer.parseInt(valorIntroducido);
	Booleanos i = new Booleanos();
	String numeros = i.testGreaterThan(valor);
	System.out.println(numeros);
}
}
