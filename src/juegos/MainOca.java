package juegos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainOca {
    private static ArrayList<Jugador> jugadores = new ArrayList<>();
    private static HashMap<Integer, Integer> mapaDeOcas = new HashMap<>();
    private static HashMap<Integer, Integer> mapaDePuentes = new HashMap<>();
    private static HashMap<Integer, Integer> mapaDeDados = new HashMap<>();
    private static final int CASILLA_META = 63;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inicializarTablero();

        System.out.print("Introduce el número de jugadores: ");
        int numJugadores = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Introduce el nombre del jugador " + i + ": ");
            String nombre = reader.readLine();
            jugadores.add(new Jugador(nombre));
        }

        boolean juegoTerminado = false;
        Random random = new Random();

        while (!juegoTerminado) {
            for (Jugador jugador : jugadores) {
                if (!jugador.isActivo()) {
                    System.out.println(jugador.getNombre() + " ha perdido el juego.");
                    continue;
                }

                if (jugador.getTurnosRestantes() > 0) {
                    jugador.setTurnosRestantes(jugador.getTurnosRestantes() - 1);
                    System.out.println(jugador.getNombre() + " está en espera y no puede tirar este turno.");
                    continue;
                }

                int tirada = random.nextInt(6) + 1;
                int nuevaCasilla = jugador.getCasilla() + tirada;

                if (nuevaCasilla == CASILLA_META) {
                    System.out.println(jugador.getNombre() + " ha llegado a la casilla 63 y ha ganado el juego!");
                    juegoTerminado = true;
                    break;
                } else if (nuevaCasilla > CASILLA_META) {
                    nuevaCasilla = CASILLA_META - (nuevaCasilla - CASILLA_META);
                }

                jugador.setCasilla(nuevaCasilla);
                System.out.println(jugador.getNombre() + " ha tirado un " + tirada + " y ha avanzado a la casilla " + nuevaCasilla);

                if (nuevaCasilla == 58) {
                    jugador.setActivo(false);
                    System.out.println(jugador.getNombre() + " ha caído en la muerte y ha perdido el juego.");
                } else if (mapaDeOcas.containsKey(nuevaCasilla)) {
                    jugador.setCasilla(mapaDeOcas.get(nuevaCasilla));
                    System.out.println("De oca a oca y tiro porque me toca. " + jugador.getNombre() + " avanza a la casilla " + jugador.getCasilla() + " y vuelve a tirar.");
                    continue;
                } else if (mapaDePuentes.containsKey(nuevaCasilla)) {
                    jugador.setCasilla(mapaDePuentes.get(nuevaCasilla));
                    System.out.println("De puente a puente y tiro porque me lleva la corriente. " + jugador.getNombre() + " avanza a la casilla " + jugador.getCasilla() + " y vuelve a tirar.");
                    continue;
                } else if (mapaDeDados.containsKey(nuevaCasilla)) {
                    jugador.setCasilla(mapaDeDados.get(nuevaCasilla));
                    System.out.println("De dado a dado y tiro porque me ha tocado. " + jugador.getNombre() + " avanza a la casilla " + jugador.getCasilla() + " y vuelve a tirar.");
                    continue;
                } else if (nuevaCasilla == 19) {
                    jugador.setTurnosRestantes(2);
                    System.out.println(jugador.getNombre() + " ha caído en la pensión y perderá los próximos 2 turnos.");
                } else if (nuevaCasilla == 3) {
                    jugador.setTurnosRestantes(1);
                    System.out.println(jugador.getNombre() + " ha caído en el pozo y perderá el próximo turno.");
                } else if (nuevaCasilla == 52) {
                    jugador.setTurnosRestantes(3);
                    System.out.println(jugador.getNombre() + " ha caído en la cárcel y perderá los próximos 3 turnos.");
                }
            }
        }
    }

    private static void inicializarTablero() {
        // Inicializar mapa de ocas
        int[] posicionesOcas = {5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59};
        for (int i = 0; i < posicionesOcas.length - 1; i++) {
            mapaDeOcas.put(posicionesOcas[i], posicionesOcas[i + 1]);
        }
        // Inicializar mapa de puentes
        mapaDePuentes.put(6, 12);
        mapaDePuentes.put(12, 6);
        // Inicializar mapa de dados
        mapaDeDados.put(26, 53);
        mapaDeDados.put(53, 26);
    }
}
