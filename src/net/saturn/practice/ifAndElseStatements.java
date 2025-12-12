package net.saturn.practice;

import java.util.Scanner;

public class ifAndElseStatements {
    public static void main(String[] args) {
        /* IF AND ELSE STATEMENTS  */

        int player1Score = 67;
        int player2Score = 25;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player's Scores");
        player1Score = scanner.nextInt();
        player2Score = scanner.nextInt();

        if(player1Score > player2Score) {
            System.out.println("Player 1 Won The Game");
        } else {
            System.out.println("Player 2 Won The Game");
        } if(player1Score == player2Score) {
            System.out.println("The Game Is A TIE");
        }
    }
}