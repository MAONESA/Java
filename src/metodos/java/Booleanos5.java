package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos5 {
	public String orderMyLogic(int val) {
		  if (val >= 10) {
		    return "Mayor o igual a 10";
		  }else if (val <5) {
			  return "Menos de 5";
		  } 
		  else if(val <10 )  {
		    return "Menos que 10";
		  } 
		  return "error";
		 
		}
	public String testSize(int num) {
		if(num >=20) {
			return "Huge";
		}else if (num <20 ) {
			return "Large";
		}else if (num < 15) {
			return "Medium";
		}else if(num < 10) {
			return "Small";
		}
		return "Tiny";
		}
	
	
	public Boolean nand(boolean valor, boolean valor2) {
		if (valor == true && valor2 ==true ) {
			return false;
		}
		return true;
	}
	public Boolean nor(boolean valor, boolean valor2) {
		if(valor == false && valor2 == false) {
			return true;
		}
		return false;
		
	}
	public Boolean xor (boolean valor, boolean valor2) {
		if (valor== false && valor2 == false || valor == true && valor2 == true ) {
			 return false;
		}return true;
	}
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un valor: ");
	String valorIntroducido = br.readLine();
	int valor = Integer.parseInt(valorIntroducido);
	Booleanos5 i = new Booleanos5();
	String numeros = i.orderMyLogic(valor);
	String cambiar = i.testSize(valor);
	Boolean nando = i.nand(false,false);
	Boolean nora  = i.nor(true, true);
	Boolean xore = i.xor(true, true);
	
	System.out.println("El 18"+nando);
	System.out.println("El 19"+ nora);
	System.out.println("El 20"+xore);
	System.out.println(cambiar);
	System.out.println(numeros);
}
}
