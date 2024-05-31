package repaso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AhorcadoString {
	public static void main(String[] args) throws IOException {
		String [] words = {"casa", "coche"};
//		int randomPosition = (int) Math.floor(Math.random()*words.length);
		Random r = new Random();
		int randomPosition = r.nextInt(2);
		String secretWord = words[randomPosition];
		String underscoreWord = secretWord.replaceAll("[a-zA-Z]","_ ");
//		char [] secretWordChars = secretWord.toCharArray();
//		char [] underscoreChars = underscoreWord.toCharArray();

		System.out.println(underscoreWord);
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	boolean haveWin = false;

	while(!haveWin) {
		System.out.println("Introduce una letra, porfa:");
		String letter = br.readLine();
		char letterChar = letter.charAt(0);
		

		for(int i = 0; i <secretWord.length(); i++) {
			if(letterChar ==  secretWord.charAt(i)) {
				underscoreWord = underscoreWord.substring(0, i*2)+letter+ underscoreWord.substring( i*2+1);
			}
		}
		if(!underscoreWord.contains("_")) {
			System.out.println("Muy bien, hemos ganado");
			haveWin = true;
		}
		System.out.println(underscoreWord);
	}
	}
}