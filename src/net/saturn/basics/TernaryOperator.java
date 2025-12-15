package net.saturn.basics;

public class TernaryOperator {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */

        int exam = 65;
        int gift = 0;

        if(exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println(gift);

        gift = exam >= 50 ? 10 : 0; // use for simple things
        System.out.println(gift);

        // practice

        int exam1 = 49;
        int gift1 = 0;

        gift1 = exam1 >= 70 ? 95 : 5;
        System.out.println(gift1);

        int test = 65;
        int score = 80;
        score = test >= 65 ? 20 : 0;
        System.out.println(score);

    }
}
