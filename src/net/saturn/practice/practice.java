package net.saturn.practice;

public class practice {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        boolean integer = 100 > 50;
        boolean integer1 = 50102 < 200;
        System.out.println("100 is greater than 50 " + integer);
        System.out.println("50102 is less than 50 " + integer1);

        int yourScore = 100;
        boolean passingScore = yourScore >= 80;
        System.out.println("You passed: " + passingScore + " With a score of " + yourScore);

        boolean hasPerfectScore = yourScore == 100;
        boolean failedClass = !hasPerfectScore;
        System.out.println(failedClass);

        //ifFailedClass is true PassClass is false
        // !hasPerfectScore true -> false
        // false -> true



        }
    }
