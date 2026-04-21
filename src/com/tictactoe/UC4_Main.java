package com.tictactoe;

import java.util.Scanner;

public class UC4_Main {

    // Method to convert slot to row and column
    public static int[] convertSlotToPosition(int slot) {

        // Convert to zero-based index
        int index = slot - 1;

        int row = index / 3;   // division → row
        int col = index % 3;   // modulo → column

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = scanner.nextInt();

        int[] position = convertSlotToPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}