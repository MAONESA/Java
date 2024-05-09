package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SentenciasIfElseIfElse {
	public String testElse(int val) {
		  String result = "";

		  if (val > 5) {
		    return result = "Bigger than 5";
		  }

		  else if (val < 5) {
		    return result = "Smaller than 5";
		  }

		  else if (val == 5) {
		    return result = "Equal to 5";
		  }

		  return result;
		}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un valor: ");
        String valorIntroducido = br.readLine();
        int valor = Integer.parseInt(valorIntroducido);
        SentenciasIfElseIfElse i = new SentenciasIfElseIfElse();
        String numeros = i.testElse(valor);
        System.out.println(numeros);
    }
}

