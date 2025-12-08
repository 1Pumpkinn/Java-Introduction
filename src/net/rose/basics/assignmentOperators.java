package net.rose.basics;

public class assignmentOperators {
    public static void main(String[] args) {
        /* Assignment Operators  */

        int x = 100;
        int y = 20;

        x = x + y; // adding y to x and adding it back into the var (x)
        x+=y;
        System.out.println(x);

        x-=y;
        System.out.println(x);

        x*=y;
        System.out.println(x)

        ;x/=y;
        System.out.println(x);

        x%=y;
        System.out.println(x);

        System.out.println("-----------------");

        // Incrementing
        x = x + 1;
        x += 1;
        x++;
        System.out.println(x);

        // Decrementing
        x = x - 1;
        x -= 1;
        x--;
        System.out.println(x);

    }
}
