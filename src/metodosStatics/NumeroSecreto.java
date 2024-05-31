package metodosStatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroSecreto {
public static void main(String[] args) throws IOException {
	
	int MIN = 1;
	int MAX = 5;
	
	double numeroAleatorio = (Math.floor(Math.random() * (MAX - MIN + 1)) + MIN);
	System.out.println("El numero aleatorio es: "+numeroAleatorio);
	
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Introduzca un numero: ");
      String valorIntroducido = br.readLine();
      
      double valor = Integer.parseInt(valorIntroducido);
      
     if (numeroAleatorio!=valor) {
		System.out.println("Los valores son diferentes, el numero aleatorio era: "+numeroAleatorio+" y el numero introducido es: "+valor);
	}else {
		System.out.println("Enhorabuena! los numeros coinciden("+numeroAleatorio+")"+valor);
	}
      
      
}
}
