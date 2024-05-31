package metodosStatics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dni {
	   // Función para obtener la letra del DNI
    public static String obtenerLetraDNI(String dni) {
        // Validar que el número de DNI tenga exactamente 8 dígitos
        if (dni.length() != 8) {
            return null;
        }

        // Calcular la letra del DNI
        int numeroDNI = Integer.parseInt(dni);
        int resto = numeroDNI % 23;

        // Cadena de texto con las letras del DNI
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Obtener la letra correspondiente según el resto
        char letra = letrasDNI.charAt(resto);

        return String.valueOf(letra);
    }
    public static void main(String[] args) throws IOException {
        // Utilizar BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Solicitar al usuario que introduzca el DNI sin letra
        System.out.println("Introduce el número de DNI sin letra:");
        String dniSinLetra = br.readLine();

        // Mostrar la traza de los datos introducidos
        System.out.println("DNI introducido: " + dniSinLetra);

        // Llamar a la función para obtener la letra del DNI
        String letraDNI = obtenerLetraDNI(dniSinLetra);

        // Mostrar el resultado en una traza
        if (letraDNI != null) {
            System.out.println("La letra del DNI es: " + letraDNI);
        } else {
            System.out.println("El número de DNI no es válido.");
        }
    }

 
}
