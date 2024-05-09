package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTriangulo {
	
	public void triangulo( int base, int altura){
		int area = base * altura /2 ;
		System.out.println(area);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca valor de la base: ");
		String valorBase = br.readLine();
		System.out.println("Introduzca valor de la altura: ");
		String valorAltura = br.readLine();
		int base = Integer.parseInt(valorBase);
		int altura = Integer.parseInt(valorAltura);
		
		AreaTriangulo i= new AreaTriangulo();
		i.triangulo(base,altura);
	}
}
