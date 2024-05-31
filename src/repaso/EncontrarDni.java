package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncontrarDni {
	public static String letraDni(String introduceDniSinLetra ) {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		if(introduceDniSinLetra.length() == 8) {
			int valorDni = Integer.parseInt(introduceDniSinLetra);
			int calcularLetra = valorDni % 23;
			String letra = letrasDni.substring(calcularLetra, calcularLetra+1);
			
			return letra;
			
		}{
			
		return null;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el dni sin letra: ");
		String introduceDniSinLetra = br.readLine();
		String resultadoLetra = letraDni(introduceDniSinLetra);
		System.out.println("Los numeros del dni son: "+introduceDniSinLetra);
		System.out.println("La letra es: "+resultadoLetra);
		
		

	}

}
