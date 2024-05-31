package metodosStatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraStatic {
	static int sumar(int a,int b){
	    return a+b;
	}

	static int restar(int a, int b) {
		return a-b;
	}

	static int multiplicar(int a, int b){
		return a*b;
	}

	static int dividir(int a, int b) {
		return a/b;
	}
	
	public static void main(String [] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	   
	    System.out.println("Introduzca primer valor: ");
		String primerValor = br.readLine();
		System.out.println("Introduzca segundo valor: ");
		String segundoValor = br.readLine();
		
	    int a = Integer.parseInt(primerValor);
	    int b = Integer.parseInt(segundoValor);
	    System.out.println("Que operación quieres realizar: [+] [-] [*] [/]: ");
	    String op = br.readLine();
	    
	    int resultado = 0;
	    
	    if( op.equals("+")){
	        resultado = sumar(a,b);
	    }else if(op.equals("-")){
	    	resultado = restar(a,b);
	    }else if (op.equals("*")) {
	    	resultado = multiplicar(a,b);
	    }else if (op.equals("/")) {
	    	resultado = dividir(a,b);
	    }else {
	    	System.out.println("Error");
	    }

	    System.out.println(resultado);
	}
}



