package src.baldFlakes3.tests;

import java.util.Scanner;

public class fahrenheit {

    public static void main (String [] args) {

        Scanner init = new Scanner (System.in);

        do {

            System.out.println("Insert the value for celsius");

            double celsius = init.nextDouble();

            double F = ((9 * celsius) / 5) + 32;

            System.out.printf("We received: %s ", F);

            System.out.println("Would you like to try again? 1/0");

            int askUser = init.nextInt();

            if (askUser == 0) break;

        } while(true);

    }

}
