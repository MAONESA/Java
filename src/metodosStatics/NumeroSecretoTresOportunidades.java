package metodosStatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumeroSecretoTresOportunidades {

	public static void main(String[] args) throws IOException {
		Random numeroRandom = new Random();
		int numeroSecreto = numeroRandom.nextInt(1,6);
		System.out.println(numeroSecreto);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean salirDelBucle = false;
		int contador = 0;

		while (!salirDelBucle) {
			System.out.println("Introduzca un valor (Tienes 3 intentos): ");
			String valorIntroducido = br.readLine();
			int valor = Integer.parseInt(valorIntroducido);
			
			if(numeroSecreto!=valor) {
				contador++;
				if(contador ==3) {
					System.out.println("Te has quedado sin intentos" );
					salirDelBucle = true;
				}
				
			}else {
				System.out.println("Enhorabuena has ganado!");
				salirDelBucle = true;
			}
			
			
		}
	}
}
