package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularFactorial {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduce un numero: ");
	String numeroIntroducido = br.readLine();
	
	int valor = Integer.parseInt(numeroIntroducido);
	int resultado = 1;
	for(int i = valor; i > 0; i--) {
		resultado = resultado * i;
	}
	System.out.println(resultado);

}
}
