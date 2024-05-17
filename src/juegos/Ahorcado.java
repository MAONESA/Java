package juegos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Ahorcado {
	static String getPalabraSecreta() {
		String [] palabras = {"casa","perro", "lobo"};
		Random r = new Random();
		int numeroAleatorio = r.nextInt(palabras.length);
		
		return palabras[numeroAleatorio];
	}
	
	static char [] getGuionesFromPalabra(String palabra) {

		int numeroLetrasPalabraSecreta = palabra.length();
		
		char [] palabraConGuiones = new char [numeroLetrasPalabraSecreta];
		
		for(int i = 0; i < palabraConGuiones.length; i++) {
			palabraConGuiones[i] = '_';
		}
		return palabraConGuiones;
	}
	
	
	
	public static void main(String[] args) throws IOException {
	String palabraSecreta = getPalabraSecreta();
	char [] palabraConGuiones = getGuionesFromPalabra(palabraSecreta);
	System.out.println(palabraConGuiones);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduce una letra");
	String letraIntroducida = br.readLine();
	
	boolean finDelJuego = false;
	while(!finDelJuego) {
		System.out.println(letraIntroducida);
		
	}
	
	}

}
