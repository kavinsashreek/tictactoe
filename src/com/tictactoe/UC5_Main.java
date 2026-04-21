package com.tictactoe;

public class UC5_Main {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check boundaries (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample board initialization
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        boolean result = isValidMove(board, row, col);

        if (result) {
            System.out.println("Move is valid");
        } else {
            System.out.println("Invalid move");
        }
    }
}