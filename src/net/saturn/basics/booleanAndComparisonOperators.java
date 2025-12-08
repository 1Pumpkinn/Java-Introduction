package net.saturn.basics;

public class booleanAndComparisonOperators {
    public static void main(String[] args) {
        /* BOOLEAN AND COMPARISON OPERATORS  */

        boolean likesTheLectures = true;
        boolean askedQuestion = false;

        System.out.println("You like these lectures " + likesTheLectures);
        System.out.println("You asked a question in the QnA " + askedQuestion);

        // COMPARISON OPERATORS
        // > >= == != < <=
        // +

        int yourScore = 49; // did not pass
        yourScore = 100; // passed

        boolean passedClass = yourScore >= 50;
        System.out.println("You passed: " + passedClass + ", with a score of " + yourScore + " points!");

        System.out.println(" ");


        boolean hasPerfectScore = yourScore == 100;
        boolean failedClass = !passedClass;

        System.out.println("You have a perfect score: " + hasPerfectScore);
        System.out.println("You failed your class: " + failedClass);

        // ifFailedClass is true, PassedClass is false
        // true -> false
        // false -> true

        System.out.println("");
        System.out.println("Practice");

        // Practice
        boolean greaterThan = 100 > 200;
        System.out.println("100 is not greater than 200: " + greaterThan);

        boolean lessThan = 100 < 200;
        System.out.println("100 is less than 200: " + lessThan);

        System.out.println("");

        boolean equals = lessThan == greaterThan; // checks to see if 100 equals 200
        System.out.println("100 is equal to 200: " + equals);

        boolean notEquals = lessThan != greaterThan;
        System.out.println("100 does not equal to 200: " + notEquals);
        // checks to see if 100 does not equal to 200

    }
}
