package net.saturn.practice;

import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {


        // Java Method Practice

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number");
        int num1 = scanner.nextInt();
        System.out.println("Second Number");
        int num2 = scanner.nextInt();

        caculator(num1, num2);
    }

    public static int caculator(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }
}
