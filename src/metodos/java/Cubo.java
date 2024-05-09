package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Crear y llamar a un método que recibe un número y calcula su cubo.
public class Cubo {
	
	public void cubo(int valor){
		System.out.println(valor*valor*valor);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca valor para el cubo: ");
		String valorIntroducido = br.readLine();
		
		int valor = Integer.parseInt(valorIntroducido);
		
		Cubo i= new Cubo();
		i.cubo(valor);
	}
}
