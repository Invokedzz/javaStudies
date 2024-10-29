package src.baldFlakes3.tests;

import java.util.Scanner;

public class sixthTest {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        System.out.println("Insert the sequence value");

        int sequence = init.nextInt();

        for (int n = 0; n <= sequence; n++) {

            System.out.println("Insert the values for X and Y\n");

            double x = init.nextDouble();

            double y = init.nextDouble();

            if (x != 0 && y != 0) {

                double receiveValues = x / y;

                System.out.printf("The result is: %s\n", receiveValues);

            }

        }

    }

}
