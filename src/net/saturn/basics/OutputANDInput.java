package net.saturn.basics;

import java.util.Scanner;

public class OutputANDInput {
    public static void main(String[] args) {
        /* Outputting with println and Inputting with Scanner */

        System.out.println("Hello Teacher!");

        int x = 10;
        System.out.println(x);

        System.out.println("Outputting some Value: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username");
        String input = scanner.next();

        System.out.println("Your Username is: " + input);

        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();
        System.out.println("You're number is: " + input1);

        Scanner scanner2 = new Scanner(System.in);
        double input2 = scanner2.nextDouble();
        System.out.println("You're double is " + input2);



        Scanner scanner3 = new Scanner(System.in);
        int input3 = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        int input4 = scanner4.nextInt();


        System.out.println(input3 + input4); // Calculator  but can only ADD not sub or multi etc
    }
}