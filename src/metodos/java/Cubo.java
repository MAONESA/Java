package metodos.java;
//Crear y llamar a un método que recibe un número y calcula su cubo.
public class Cubo {
	
	public void cubo(int valor){
		System.out.println(valor*valor*valor);
	}

	public static void main(String[] args) {
		Cubo i= new Cubo();
		i.cubo(5);
	}
}
