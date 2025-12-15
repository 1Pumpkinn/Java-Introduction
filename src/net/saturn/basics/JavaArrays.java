package net.saturn.basics;

public class JavaArrays {
    public static void main(String[] args) {
        /* ARRAYS */

        String question1 = "How many States does the USA have?";
        String question2 = "What is the Capital of the United Kingdom";
        String question3 = "What is the chemical symbol for Iron";

        String answer1 = "50";
        String answer2 = "London";
        String answer3 = "Fe";

        String[] questions = new String[3];
        questions[0] = "How many States are there in the USA";
        questions[1] = "What is the Capital of the United Kingdom";
        questions[2] = "What is the chemical symbol for Iron";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        System.out.println(questions[1]);
        System.out.println(answers[1]);

        questions[0] = "How old is Ewan McGregor (in 2021)?";
        System.out.println(questions[0]);
        System.out.println(answers[0]);

        System.out.println(questions.length);

        // ArrayIndexOutOfBoundsException (Uncomment line below)
        // System.out.println(questions[3]);

        // Practice

        System.out.println("What test number number is this");
        String[] questions1 = new String[3];
        questions1[0] = "test";
        questions1[1] = "test";
        questions1[2] = "test";

        String[] answers1 = new String[3];
        answers1[0] = "0";
        answers1[1] = "1";
        answers1[2] = "2";
        System.out.println(questions1[0]);
        System.out.println(answers1[0]);


    }
}
