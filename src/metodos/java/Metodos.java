package metodos.java;

import metodos.java.Metodos;

public class Metodos {
// Crear y llamar a un método que reciba como parámetro de entrada un valor booleano y muestre «Sí, eso es cierto» si el valor es true, y «No, eso es falso» si el valor es false.
	public void miau(boolean introducido){
		if(introducido==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		Metodos i;
		i = new Metodos();
		i.miau(true);
	}
}
