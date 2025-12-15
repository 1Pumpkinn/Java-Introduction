package net.saturn.basics;

public class stringAndStringMethods {
    public static void main(String[] args) {
        /* STRINGS AND STRING-METHODS */

        String sentence = "What a Wonderful Java Introduction!";

        System.out.println(sentence);
        System.out.println(sentence.length());

        // Uppercase and Lowercase

        // SHOUTING
        System.out.println(sentence.toUpperCase());

        // whispering
        System.out.println(sentence.toLowerCase());

        System.out.println(sentence);

        // indexOf
        System.out.println(sentence.indexOf("Java"));

        // Replace
        System.out.println(sentence.replace("Java", "C#"));

        System.out.println(sentence.startsWith("W"));
        System.out.println(sentence.endsWith("A"));

        String s = "";
        boolean empty = s.isEmpty();
        System.out.println(empty);

        // contains
        System.out.println(sentence.contains("Java"));

        // charAt
        System.out.println(sentence.charAt(1)); // counts from 0 to max number

        // subString
        System.out.println(sentence.substring(17));

        // Trying
        System.out.println(sentence.endsWith("!"));
        System.out.println(sentence.repeat(2));
    }
}
