package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos2 {
	public String testLessThan(int val) {
		  if (val<25) {  // Cambia esta línea
		    return "Por debajo de 25";
		  }

		  if (val<55) {  // Cambia esta línea
		    return "Por debajo de 55";
		  }

		  return "55 o más";
		}
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un valor: ");
	String valorIntroducido = br.readLine();
	int valor = Integer.parseInt(valorIntroducido);
	Booleanos2 i = new Booleanos2();
	String numeros = i.testLessThan(valor);
	System.out.println(numeros);
}
}
