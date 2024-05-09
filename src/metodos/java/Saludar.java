package metodos.java;

public class Saludar {

	public String saludar(String valor) {
		return "Hola "+valor+"!";
		
	}
	public static void main(String[] args) {
	Saludar i = new Saludar();
	String ada = i.saludar("Ada");
	String grace = i.saludar("Grace");
	System.out.println(ada+"\n"+grace);
}
}
