package juegos;

import java.util.Scanner;

public class TicTacToe {
	// Definir un array de Strings de 9 posiciones
    static String[] board = new String[9];

    public static void main(String[] args) {
        // Inicializar cada posición del array con guiones bajos
        for (int i = 0; i < board.length; i++) {
            board[i] = "_";
        }

        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        boolean playerXTurn = true; // Comienza el jugador X

        // Bucle para solicitar movimientos y comprobar si hay ganador
        while (!gameWon) {
            showBoard();
            System.out.println("Turno del jugador " + (playerXTurn ? "X" : "O") + ": ");
            System.out.print("Introduce la posición (0-8): ");
            int position = scanner.nextInt();

            // Validar la posición introducida
            if (position < 0 || position > 8 || !board[position].equals("_")) {
                System.out.println("Posición no válida. Inténtalo de nuevo.");
                continue;
            }

            // Pintar la X o O en la posición indicada
            board[position] = playerXTurn ? "X" : "O";

            // Comprobar si hay un ganador
            gameWon = evaluateWin();
            if (gameWon) {
                showBoard();
                System.out.println("¡Jugador " + (playerXTurn ? "X" : "O") + " ha ganado!");
                break;
            }

            // Cambiar el turno de jugador
            playerXTurn = !playerXTurn;
        }
        scanner.close();
    }

    // Método para mostrar el tablero en la consola
    public static void showBoard() {
        System.out.println(board[0] + " " + board[1] + " " + board[2]);
        System.out.println(board[3] + " " + board[4] + " " + board[5]);
        System.out.println(board[6] + " " + board[7] + " " + board[8]);
    }

    // Método para evaluar si hay un ganador
    public static boolean evaluateWin() {
        // Comprobar horizontales
        if (checkLine(0, 1, 2) || checkLine(3, 4, 5) || checkLine(6, 7, 8)) {
            return true;
        }
        // Comprobar verticales
        if (checkLine(0, 3, 6) || checkLine(1, 4, 7) || checkLine(2, 5, 8)) {
            return true;
        }
        // Comprobar diagonales
        if (checkLine(0, 4, 8) || checkLine(2, 4, 6)) {
            return true;
        }
        return false;
    }

    // Método auxiliar para comprobar si tres posiciones tienen la misma ficha
    public static boolean checkLine(int pos1, int pos2, int pos3) {
        return !board[pos1].equals("_") && board[pos1].equals(board[pos2]) && board[pos2].equals(board[pos3]);
    }}


