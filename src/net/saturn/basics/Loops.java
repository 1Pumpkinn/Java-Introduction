package net.saturn.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* LOOPS */

        String[] questions = new String[3];
        questions[0] = "How many States are there in the USA";
        questions[1] = "What is the Capital of the United Kingdom";
        questions[2] = "What is the chemical symbol for Iron";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        for (int i = 0; i < 100; i++) {
            // loops until 100 after it reaches 100 it returns false and stops printing
            System.out.println(i);
        }

        // for loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        // foreach
        for (String question : questions) {
            System.out.println(question);

            // how to read this?
            // for each String question in questions
        }

        Scanner scanner = new Scanner(System.in);

        // While loop AND endless!
        while (true) {
            System.out.println("Do you want to continue?");
            if (scanner.next().equals("yes")) {
                continue;
            } else {
                break;
            }
        }

        // practice




        for(long l = 0; l < 501; l++) {
            System.out.println(l);
        }
        int meow = 9;

        while(true) {
            if (meow == 10) {
                System.out.println(meow);
                break;
            } else {
                System.out.println("FUCK");
                break;
            }
        }

        String[] testy = new String[4];
        testy[0] = "testy0";
        testy[1] = "tesy1";
        testy[2] = "testy2";
        testy[3] = "testy3";

        for(String questions1 : testy ) {
            System.out.println(questions1);
        }
    }
}
