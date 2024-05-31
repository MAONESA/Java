package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeRepaso {
	static String [] tablero = new String [9];
	public static void showBoard() {
		System.out.println(tablero[0]+"|"+tablero[1]+"|"+tablero[2]);
		System.out.println(tablero[3]+"|"+tablero[4]+"|"+tablero[5]);
		System.out.println(tablero[6]+"|"+tablero[7]+"|"+tablero[8]);
	}
	public static boolean revisarLinea(int a,int b, int c) {
		return !tablero[a].equals("_") && tablero[a].equals(tablero[b]) && tablero[b].equals(tablero[c]);
	}
	
	public static boolean evaluarSiGanas() {
		if(revisarLinea(0, 1, 2) || revisarLinea(3, 4, 5) || revisarLinea(6, 7, 8)) {
			return true;
		}
		if(revisarLinea(0, 3, 6) || revisarLinea(1, 4, 7) || revisarLinea(2, 5, 8)) {
			return true;
		}
		if(revisarLinea(0, 4, 8) || revisarLinea(2, 4, 6)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		for(int i = 0; i <tablero.length; i++) {
			tablero[i] = "_";
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean evaluateWin = false;
		boolean jugadorX = true;
		while(!evaluateWin) {
			showBoard();
			System.out.println("Turno del jugador: "+(jugadorX ? "X":"O"));
			System.out.println("Introduce posicion:  (0-8)");
			String posicionIntroducida = br.readLine();
			
			int posicion = Integer.parseInt(posicionIntroducida);
			
			if (posicion < 0 || posicion >8 || !tablero[posicion].equals("_")) {
				System.out.println("Posicion no válida. Intentalo de nuevo");
				continue;
			}
		tablero[posicion] = jugadorX ? "X": "O";
		evaluateWin = evaluarSiGanas();
		
		if (evaluateWin) {
			showBoard();
			System.out.println("Jugador "+ (jugadorX ? "X" : "O"));
			break;
		}
		jugadorX = !jugadorX;
		
		}
	}	

}
