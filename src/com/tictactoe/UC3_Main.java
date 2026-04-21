package com.tictactoe;

import java.util.Scanner;

public class UC3_Main {

    // Method to get user input
    public static int getPlayerInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot; // return the entered value
    }

    public static void main(String[] args) {

        int userSlot = getPlayerInput();

        System.out.println("You entered slot: " + userSlot);
    }
}