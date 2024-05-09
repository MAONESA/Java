package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaPerimetroCircunferencia {
	void calculaPerimetro(int radio){
		double perimetro = 2 * Math.PI * radio;
		System.out.println("El perimetro de la circunferencia es: "+perimetro);
	}
	void calculaArea(int radio){
		double area = Math.PI *(Math.pow(radio, 2));
		System.out.println("El area de la circunferencia es: "+area);
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca valor para el radio: ");
		String valorRadio = br.readLine();
		
		int valor = Integer.parseInt(valorRadio );
		
		
		//Declaracion de la funcion / Método
		AreaPerimetroCircunferencia i;
		i = new AreaPerimetroCircunferencia();
		i.calculaPerimetro(valor);
		i.calculaArea(valor);
		
	}
}
