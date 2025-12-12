package net.saturn.basics;

public class switchStatements {
    public static void main(String[] args) {
        /* SWITCH STATEMENT  */

        int medalPlacement = 2;

        switch (medalPlacement) {
            case 1: System.out.println("GOLD MEDAL"); break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 3: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAL"); break;
        }
    }
}
