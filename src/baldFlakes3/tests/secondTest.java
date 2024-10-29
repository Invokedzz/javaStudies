package src.baldFlakes3.tests;

import java.util.Scanner;

public class secondTest {

    public static void main (String[] args) {

        Scanner initScanner = new Scanner (System.in);

        System.out.println("Insert a value for n");

        int n = initScanner.nextInt();

        for (int x = 0; x <= n; x++) {

            if (x >= 10 && x <= 20) System.out.printf("In: %s ", x);

            else System.out.printf("Out: %s ", x);

        }

    }

}
