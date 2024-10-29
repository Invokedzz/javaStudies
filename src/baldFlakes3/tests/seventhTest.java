package src.baldFlakes3.tests;

import java.util.Scanner;

public class seventhTest {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        System.out.println("Insert the sequence value");

        int sequencePattern = init.nextInt();

        for (double q = 0; q <= sequencePattern; q++) {

            double receiveSquare = Math.pow(q, 2.0);

            double receiveCube = Math.pow(q, 3.0);

            System.out.printf("%s %s %s\n", q, receiveSquare, receiveCube);

        }

    }

}
