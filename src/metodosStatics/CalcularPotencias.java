package metodosStatics;

public class CalcularPotencias {
public static void main(String[] args) {
int base = 3;
int exponente = 6;
int resultado = 1;

	for(int i=0; i<exponente;i++) {
		 resultado =  resultado * base;
		System.out.println(resultado);
	}
		
}
}
