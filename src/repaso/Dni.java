package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dni {
public static String obtenerLetraDni(String dni) {
	
    if (dni.length() != 8) {
        return null;
    }
	int sacarValorDni = Integer.parseInt(dni);
	int sacarPosicionLetraDni = sacarValorDni % 23;
	
	String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	char letraEncontrada = letrasDni.charAt(sacarPosicionLetraDni);
	return String.valueOf(letraEncontrada);
    
	
}
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Introduce tu dni sin la letra: ");
		 String dni = br.readLine();
		 System.out.println("Los numeros del dni introducidos son: "+dni);
		 
		 
		 String letraDni = obtenerLetraDni(dni);
		 
	      if (letraDni != null) {
	            System.out.println("La letra del DNI es: " + letraDni);
	        } else {
	            System.out.println("El número de DNI no es válido.");
	        }
		 
		 
}
}
