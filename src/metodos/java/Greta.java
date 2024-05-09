package metodos.java;

public class Greta {

	public String greta(String valor){
		return valor;
		
	}
	public static void main(String[] args) {
		Greta i = new Greta();
		String x = i.greta("Greta");
		String y = i.greta("CO2");
		System.out.println(x+"\n"+y);
		
	}
}
