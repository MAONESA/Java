package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimetro {
	
	public void calculaPerimetro(int alto, int ancho) {
		int perimetro = 2*alto + 2*ancho;
		System.out.println(perimetro);
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca altura: ");
		String alturaIntroducida = br.readLine();
		System.out.println("Introduzca anchura: ");
		String anchuraIntroducida = br.readLine();
		int altura = Integer.parseInt(alturaIntroducida );
		int anchura = Integer.parseInt(anchuraIntroducida);
		
		//Declaracion de la funcion / Método
		Perimetro i;
		i = new Perimetro();
		i.calculaPerimetro(altura,anchura);
	}
}
