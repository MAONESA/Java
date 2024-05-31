package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Elemeno07 {
public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Introduce un numero del 1 - 12: ");
	  String introduceMes = br.readLine();
	 int mes = Integer.parseInt(introduceMes);
	  
	  String []meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	 
	  if (mes >= 1 && mes <= 12) {
			System.out.println(meses[mes - 1]);
		} else {
			System.out.println("El numero introducido no es correcto");
		}
	  
}
}