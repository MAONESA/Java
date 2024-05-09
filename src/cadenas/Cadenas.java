package cadenas;

public class Cadenas {
	//4.
	void devuelveEnesimaLetra(String valor, int valor2) {
		System.out.println(valor.charAt(valor2));
	}
	//5.	
	void substring(String valor) {
		System.out.println(valor.substring(3,7));
	}
	//6
	public String devuelveMasLarga(String cadena, String cadena2) {
		
	if(cadena.length()> cadena2.length()) {
		return cadena;
	}else if (cadena.length()< cadena2.length()) {
		return cadena2;
	}return cadena;
	}
	//7	
	public String devuelveMasLarga2(String cadena, String cadena2, String cadena3) {
		if(cadena.length() > cadena2.length() && cadena.length() > cadena3.length() ){
			return cadena;
		}else if(cadena2.length() > cadena.length() && cadena2.length()> cadena3.length()) {
		return cadena2;	
		}else if (cadena3.length()> cadena.length() && cadena3.length() > cadena2.length()) {
			return cadena3;
		}{
			return cadena;
		}
		
	}
	//8
	public String generarNombre(String nombre,String nombre2, String nombre3) {
		if (nombre.length() < 5 || nombre2.length() <5 || nombre3.length() < 5) {
			return "Error";			
		
		}else {
			String todasLasCadenas = nombre.substring(0,3)+nombre2.substring(0,3)+nombre3.substring(0,3);
			return todasLasCadenas;
		}
			
		}
	//9	
	public String generarNombre2(String a, String b, String c) {
	if (a.length() < 5 && b.length() < 5 && c.length() <5) {
		return "Error";
	}else {

		return a.substring(a.length() - 1) +b.substring(b.length() - 1) +c.substring(c.length() - 1);
//		  System.out.println(a.charAt(a.length() - 1) +b.charAt(b.length() - 1) +c.charAt(c.length() - 1) );
		
		
	}
	
}
	//10	
	public String generarNombre3 (String a, String b, String c) {
		if (a.length() < 5 && b.length() < 5 && c.length() <5) {
			return "Error";
		}else {

			return a.substring(a.length() - 3)+b.substring(b.length() - 3)+c.substring(c.length() - 3);
			
			
		}
		
	}
	//11
	public Boolean tieneLetra(String a, String b) {
		if (a.indexOf(b) >=0) {
			return true;
		}{
		return false;
		}
	}
	//12
	public Boolean tieneLetra2(String a, String b) {
		String convertirPalabraMinuscula = a.toLowerCase();
		String letraMinuscula = b.toLowerCase();
		if (convertirPalabraMinuscula.indexOf(letraMinuscula) >=0) {
			return true;
		}{
		return false;
		}
	}
	//13
//	public String crearPalabra(String a, int b) {
//		
//		  for (int i = 0; i < b; i++) {
//		       a;
//		    }
//	}
	
	
	public static void main(String[] args) {
	Cadenas i = new Cadenas();
	//4.
	i.devuelveEnesimaLetra("Ramon",2);
	//5.
	i.substring("Wonderful day");
	//6
	String mostrarCadena = i.devuelveMasLarga("Sara", "Sam");
	System.out.println(mostrarCadena);
	//7
	String mostrarCadena2 = i.devuelveMasLarga2("A1", "A23", "A34");
	System.out.println(mostrarCadena2);
	//8
	String generarNombreChulo = i.generarNombre("Palabras","Compuestas","HistoriaDelArrte");
	System.out.println(generarNombreChulo);
	//9
	String generarNombreChulo2 = i.generarNombre2("Palabras", "Generacion", "LagosDeCovadonga");
	System.out.println(generarNombreChulo2);
	//10
	String generarNombreChulo3 = i.generarNombre3("Estrella","Computadora","Universidad");
	System.out.println(generarNombreChulo3);
	//11
	Boolean letra = i.tieneLetra("Colores","e");
	System.out.println(letra);
	//12
	Boolean letra2 = i.tieneLetra2("LucesDeColores", "a");
	System.out.println(letra2);
	//13
//	String newWord = i.crearPalabra("a",3);
//	System.out.println(newWord);
}
}
