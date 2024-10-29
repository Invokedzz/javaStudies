package src.baldFlakes3.tests;

import java.util.Scanner;

public class fifthTest {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert a value (numeric)");

        int x = initSc.nextInt();

        for (int y = 0; y <= x; y++) {

            if (y % 2 != 0) System.out.println(y);

        }

        System.out.println("Done!");

    }

}
