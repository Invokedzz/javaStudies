package src.baldFlakes2;

import java.util.Scanner;

public class fifthTest {

    public static void main (String[] args) {

        fTest(args);

    }

    public static void fTest (String[] args) {

        Scanner initScanner = new Scanner(System.in);

        double x, y;

        System.out.println("Insert the values for x and y\n");

        x = initScanner.nextDouble();

        y = initScanner.nextDouble();

        if (x == 0 & y == 0) System.out.println("Origin");

        else if (x > 0 && y > 0) System.out.println("Q1");

        else if (x < 0 && y > 0) System.out.println("Q2");

        else if (x < 0 && y < 0) System.out.println("Q3");

        else if (x > 0 && y < 0) System.out.println("Q4");

        else System.out.println("Invalid. Plague");

    }

}
