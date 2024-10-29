package src.baldFlakes3.tests;

import java.util.Scanner;

public class firstTest {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        System.out.println("Insert the sequence value\n");

        int receiveValue = init.nextInt();

        for (int p = 1; p <= receiveValue; p++) {

            if (receiveValue % p == 0) System.out.println(p);

        }

        System.out.println("Done!");

    }

}
