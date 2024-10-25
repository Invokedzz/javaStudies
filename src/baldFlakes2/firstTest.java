package src.baldFlakes2;

import java.util.Scanner;

public class firstTest {

    public static void main (String[] args) {

        fTest(args);

    }

    public static void fTest (String[] args) {

        Scanner init = new Scanner(System.in);

        int randomValue;

        randomValue = init.nextInt();

        if (randomValue % 2 == 0) System.out.println("Par");

        else System.out.println("Imp");

    }

}
