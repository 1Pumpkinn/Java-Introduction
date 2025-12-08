package net.rose.basics;

public class IntegersANDArithmetic {
    public static void main(String[] args) {
        /* Integers, Math and Arithmetic Operators  */

        int x = 100;
        int y = 20;

        int result;

        // Addition
        result = x + y;
        System.out.println(result);

        // Subtraction
        result = x - y;
        System.out.println(result);

        // Multiplication
        result = x * y;
        System.out.println(result);

        // Division
        result = x / y;
        System.out.println(result);

        // Remainder
        result = 20 % 2;
        System.out.println(result);

        // MATH METHODS
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.abs(500)); // |- 500| = 500
        System.out.println(Math.round(94.31)); // 94
        System.out.println(Math.round(94.85)); // 95
        System.out.println(Math.PI);

    }
}