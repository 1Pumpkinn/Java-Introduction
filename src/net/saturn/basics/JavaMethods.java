package net.saturn.basics;

import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {
        /* METHODS */
        // que = questions ans = answers

        String[] que = new String[3];
        que[0] = "How many States does the USA have?";
        que[1] = "What is the Capital of the United Kingdom";
        que[2] = "What is the chemical symbol for Iron";

        String[] ans = new String[3];
        ans[0] = "50";
        ans[1] = "London";
        ans[2] = "Fe";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Gender: ");
        String gender = scanner.next();
        System.out.println("Species: ");
        String species = scanner.next();

        outputQuestionsAndAnswers(que, ans);
        System.out.println(sum(10, 12));
        System.out.println(testingMethods(90, 60));
        testingMethodsTwo(name, gender, species);
    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double testingMethods(double num1, double num2) {
        return num1 - num2;
    }


    public static void testingMethodsTwo(String name, String gender, String species) {
        System.out.println("My name is " + name);
        System.out.println("My gender is a " + gender);
        System.out.println("My species is a " + species);
    }
}
