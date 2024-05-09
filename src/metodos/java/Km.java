package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Km {
	public void metros(int kmMetros){
		System.out.println(kmMetros*1000+" metros");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca valor para convertir km a metros: ");
		String valorIntroducido = br.readLine();

		int valor = Integer.parseInt(valorIntroducido);
		
		Km i= new Km();
		i.metros(valor);
	}

}
