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
	public String crearPalabra(String a, int b) {
		String palabra = "";
		  for (int i = 0; i < b; i++) {
		       palabra+=a;
		    }return palabra;
	}
	//14
	public String crearPalabra2(String a, int b) {
		String palabraMayuscula = a.toUpperCase();
		String palabra = "";
		  for (int i = 0; i < b; i++) {
		       palabra+=palabraMayuscula;
		    }return palabra;
	}
	//15
	public String addGuiones(String a) {
		String palabraConGuiones = "";
		
		for(int i = 0; i<a.length();i++) {
			 palabraConGuiones += a.charAt(i);
			 palabraConGuiones += "-";
		}
		return palabraConGuiones;
	}
	//16
	public int contadorDeLetras(String a, String b) {
		int contador = 0;
		for(int i = 0; i < a.length();i++) {
			if (a.substring(i,i+1).equals(b)) {
				contador++;
			}
		}return contador;
	}
	//17
	public int contadorDeLetras2(String a, String b) {
		int contador = 0;
		String palabraMinuscula = a.toLowerCase();
		String letraMinuscula = b.toLowerCase();
		for(int i = 0; i < a.length();i++) {
			if (palabraMinuscula.substring(i,i+1).equals(letraMinuscula)) {
				contador++;
			}
		}return contador;
	}
	//18
	public String contadorDeLetras3 (String a, String b, String c) {
		int contador1 = 0;
	    int contador2 = 0;
	    String cadena1 = a.toLowerCase();
	    String cadena2 = b.toLowerCase();
	    String letraMinuscula = c.toLowerCase();
	    
	    for (int i = 0; i < cadena1.length(); i++) {
	        if (cadena1.substring(i, i + 1).equals(letraMinuscula)) {
	            contador1++;
	        }
	    }
	    
	    for (int i = 0; i < cadena2.length(); i++) {
	        if (cadena2.substring(i, i + 1).equals(letraMinuscula)) {
	            contador2++;
	        }
	    }
	    
	    if (contador1 > contador2) {
	        return cadena1;
	    } else if (contador2 > contador1) {
	        return cadena2;
	    } else {
	        return "Las dos cadenas son tienen los mismos caracteres iguales"; // O cualquier otro valor de retorno que indique igualdad
	    }
	}
	//19
	public String toCase(String texto) {


	    String minusculas = texto.toLowerCase();
	    String mayusculas =texto.substring(0, 1).toUpperCase() + texto.substring(1);

	    return minusculas + "-" + mayusculas;
	}
	//20
	public String shortcut(String a, String b) {
		String nuevaPalabra = a.substring(0, 1);
		String nuevaPalabra2 = b.substring(0, 1);
		return nuevaPalabra + nuevaPalabra2;
	}
	//21
	public char firstChar(String texto) {
	    // Eliminar espacios en blanco al principio y al final de la cadena
	    String textoSinEspacios = texto.trim();

	    // Recorrer la cadena hasta encontrar la primera letra que no sea un espacio
	    for (int i = 0; i < textoSinEspacios.length(); i++) {
	        char caracter = textoSinEspacios.charAt(i);
	        if (caracter != ' ') {
	            return caracter;
	        }
	    }

	    // Si la cadena está vacía o contiene solo espacios, devolver un carácter por defecto
	    return '\0';
	} 
	//23
	public int indexOfIgnoreCase(String texto, String subcadena) {
	    // Convertir ambas cadenas a minúsculas para ignorar la diferencia entre mayúsculas y minúsculas
	    String textoLower = texto.toLowerCase();
	    String subcadenaLower = subcadena.toLowerCase();

	    // Utilizar el método indexOf para encontrar la primera ocurrencia de la subcadena en el texto
	    return textoLower.indexOf(subcadenaLower);
	}
	//24
	public String firstWord(String texto) {
		 int indiceEspacio = texto.indexOf(' ');

		    // Si no se encuentra ningún espacio en blanco, devolver la cadena completa
		    if (indiceEspacio == -1) {
		        return texto;
		    }

		    // Devolver la subcadena desde el inicio hasta el primer espacio en blanco
		    return texto.substring(0, indiceEspacio);
	}
	
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
	String newWord = i.crearPalabra("a",3);
	System.out.println(newWord);
	//14
	String newWord2 = i.crearPalabra2("z",4);
	System.out.println(newWord2);
	//15
	String palabraConGuiones = i.addGuiones("Lucas");
	System.out.println(palabraConGuiones);
	//16
	int contadorLetras = i.contadorDeLetras("Maria","r");
	System.out.println(contadorLetras);
	//17
	int contadorLetras2 = i.contadorDeLetras("Galletas", "l");
	System.out.println(contadorLetras2);
	//18
	String contadorLetras3 = i.contadorDeLetras3("Politicos", "Policia", "l");
	System.out.println(contadorLetras3);
	//19
	String pablo = i.toCase("pablo");
	System.out.println(pablo);
	//20
	String politica = i.shortcut("Amnistia", "Internacional");
	System.out.println(politica);
	//21
	char rosa = i.firstChar(" Rosa Parks ");
	System.out.println(rosa);
	//23
	int bitIT = i.indexOfIgnoreCase("bit","it");
	System.out.println(bitIT);
	//24
	String firstPalabra = i.firstWord("see and stop");
	System.out.println(firstPalabra);
	
	}
}
