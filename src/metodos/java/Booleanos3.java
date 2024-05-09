package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos3 {
	public String testLessOrEqual(int val) {
		  if (val<=12) {  // Cambia esta línea
		    return "Menor o igual a 12";
		  }

		  if (val<=24) {  // Cambia esta línea
		    return "Menor o igual a 24";
		  }

		  return "More Than 24";
		}
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un valor: ");
	String valorIntroducido = br.readLine();
	int valor = Integer.parseInt(valorIntroducido);
	Booleanos3 i = new Booleanos3();
	String numeros = i.testLessOrEqual(valor);
	System.out.println(numeros);
}
}
