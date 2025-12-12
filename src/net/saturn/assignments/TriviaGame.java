package net.saturn.assignments;

import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        /* ASSIGNMENT 1 */

        /*
         * CREATE A SIMPLE TRIVIA GAME
         *
         * Define (at least) three questions with three answers.
         * Prompt the User the type in their answer using the Scanner, you've seen in the output/input video
         * Then use if/else statements to check if the answer from the user is correct! And output that they were.
         * If they were wrong, tell the user and output the correct answer.
         * Increment a points total each time the user is correct and at the end make a unique output for each
         * score the user might have (0 to 3)
         *
         * IMPORTANT TIPS:
         * 1. When reading in Strings from the user use scanner.next() (NOT scanner.nextLine())
         * 2. When you have an answer and input that are both strings you will have to use:
         *    userInput.equals(answer) instead of userInput == answer
         */

        int points = 0;
        String cSmpOwner = "DoctorRat";
        String bestCSmpMember = "Luxintrus";
        String theGoatOfElementSmp = "Acespeke";

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (userInput.equals(cSmpOwner)) {
            points++;
            System.out.println("CORRECT You have " + points + " Points");
        } else {
            System.out.println("INCORRECT, The answer was " + cSmpOwner);
        }
        Scanner scanner1 = new Scanner(System.in);
        String userInput1 = scanner1.next();
        if (userInput1.equals(bestCSmpMember)) {
            points++;
            System.out.println("CORRECT You have " + points + " Points");
        } else {
            System.out.println("INCORRECT, The answer was " + bestCSmpMember);
        }
        Scanner scanner2 = new Scanner(System.in);
        String userInput2 = scanner2.next();
        if (userInput2.equals(theGoatOfElementSmp)) {
            points++;
            System.out.println("CORRECT You have " + points + " Points");
        } else {
            System.out.println("INCORRECT, The answer was " + theGoatOfElementSmp);
        }
        System.out.println("You're Total Points Are: " + points);
    }
}


