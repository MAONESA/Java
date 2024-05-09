package metodos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SentenciaIf {
    public String testElse(int val) {
        String result = "";

        if (val > 5) {
            result = "Mayor que 5";
        } else if (val <= 5) {
            result = "5 o menos";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un valor: ");
        String valorIntroducido = br.readLine();
        int valor = Integer.parseInt(valorIntroducido);
        SentenciaIf i = new SentenciaIf();
        String numeros = i.testElse(valor);
        System.out.println(numeros);
    }
}

