package com.tictactoe;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create board (2D array)
        char[][] board = new char[3][3];

        // Step 2: Initialize board with '-'
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }

        // Step 3: Print the board
        System.out.println("Initial Tic Tac Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line
        }
    }
}