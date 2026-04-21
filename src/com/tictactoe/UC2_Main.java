package com.tictactoe;

import java.util.Random;

public class UC2_Main {
    public static void main(String[] args) {

        Random random = new Random();
        int toss = random.nextInt(2);

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = "Player 1";
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = "Player 2";
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}
