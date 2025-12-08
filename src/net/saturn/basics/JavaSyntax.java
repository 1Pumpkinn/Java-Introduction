package net.saturn.basics;

public class JavaSyntax {
    public static void main(String[] args) {
        /* HOW TO READ CODE / Java Syntax */

        // Code is read from top to bottom

        // This is a single line Comment

        /*
         *
         * This is a
         * Multiline Comment!
         *
         * */

        // Declaring a Variable | Note that all lines end with a semi-colon!
        int i;

        // Assigning a Variable
        i = 30;

        // Declaring and Assigning (Initializing)
        int x = 10;

        // Access variables/method of Objects
        String s = "Hello World";
        s.length();
        System.out.println(s.length()); // 11 because it also counts the space in the String.
    }
}