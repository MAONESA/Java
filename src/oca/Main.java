package oca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
private static ArrayList <Jugador> jugadores = new ArrayList<>();
private static HashMap <Integer, Integer> mapaDeOcas = new HashMap<>();
private static HashMap <Integer, Integer> mapaDePuentes = new HashMap<>();
private static HashMap <Integer, Integer> mapaDeDatos = new HashMap<>();
private static final int CASILLA_META = 63;

private static void inicializarTablero() {
	int[] posicionesFichas = {5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59};
	for(int i = 0; i<posicionesFichas.length - 1; i++) {
		mapaDeOcas.put(posicionesFichas[i], posicionesFichas[i+1]);
	}
	mapaDePuentes.put(6, 12);
	mapaDePuentes.put(12,6);
	
	mapaDeDatos.put(26,53);
	mapaDeDatos.put(53, 26);
}


public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	inicializarTablero();
	
	System.out.println("Introduce el numero de jugadores: ");
	String valorIntroducido = br.readLine();
	int numeroJugadores = Integer.parseInt(valorIntroducido);
	for(int i = 1; i<=numeroJugadores; i++ ) {
		System.out.println("Introduce el nombre del jugador "+i+ ":");
		String nombreIntroducido = br.readLine();
		jugadores.add(new Jugador(nombreIntroducido));
	}
	boolean finDelJuego = false;
	Random random = new Random();
	while(!finDelJuego) {
		for(Jugador jugador : jugadores) {
			if(!jugador.isActivo()) {
				System.out.println(jugador.getNombre() + " ha perdido el juego");
				continue;
			}
			if(jugador.getTurnosRestantes() > 0) {
				jugador.setTurnosRestantes(jugador.getTurnosRestantes() - 1);
				System.out.println(jugador.getNombre() + " está en espera y no puede tirar este turno.");
				continue;
			}
			int tirada = random.nextInt(6) + 1;
			int nuevaCasilla = jugador.getCasillas() + tirada;
			if (nuevaCasilla == CASILLA_META) {
				System.out.println(jugador.getNombre() + " ha llegado a la casilla 63 y ha ganado el juego!");
				finDelJuego = true;
				break;
			} else if (nuevaCasilla > CASILLA_META) {
				nuevaCasilla = CASILLA_META - (nuevaCasilla - CASILLA_META);
			}
			jugador.setCasilla(nuevaCasilla);
			System.out.println(jugador.getNombre() + " ha tirado un " + tirada + "y ha avanzado a la casilla " + nuevaCasilla);
			if(nuevaCasilla == 58) {
				jugador.setActivo(false);
				System.out.println(jugador.getNombre() + " ha caído en la muerte y ha perdido el juego.");
			}else if (mapaDeOcas.containsKey(nuevaCasilla)) {
				jugador.setCasilla(mapaDeOcas.get(nuevaCasilla));
				System.out.println(" De oca a oca tiro por que me toca ..." + jugador.getNombre() + " avanza la casilla "+jugador.getCasillas() + " y vuelve a tirar.");
				continue;
			}else if(mapaDePuentes.containsKey(nuevaCasilla)) {
				jugador.setCasilla(mapaDePuentes.get(nuevaCasilla));
				System.out.println(" De puente a puente y tiro por que me lleva la corriente. "+jugador.getNombre() + "avanza a la casilla "+ jugador.getCasillas() + " y vuelve a tirar.");
				continue;
			}else if(mapaDeDatos.containsKey(nuevaCasilla)) {
				jugador.setCasilla(mapaDeDatos.get(nuevaCasilla));
				System.out.println(" De dado a dado y tiro porque me ha tocado. " + jugador.getNombre() + " avanza a la casilla " + jugador.getCasillas() + " y vuelve a tirar.");
				continue;
			}else if (nuevaCasilla == 19) {
				jugador.setTurnosRestantes(2);
				System.out.println(jugador.getNombre() + " ha caído en la pensión y perdera los 2 turnos.");
			}else if (nuevaCasilla == 3) {
				jugador.setTurnosRestantes(1);
				System.out.println(jugador.getNombre() + " ha caído en el pozo y perderá el próximo turno.");
			}else if (nuevaCasilla == 52) {
				jugador.setTurnosRestantes(3);
				System.out.println(jugador.getNombre() + " ha caído en la cárcel y perdera los próximos 3 turnos.");
			}
 		}
	}
	
	
}

}
