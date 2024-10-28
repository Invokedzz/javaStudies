package src.baldFlakes2.tests;

import java.util.Scanner;

public class cartTest {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert both values for x and y");

        while (true) {

            int x = initSc.nextInt();

            int y = initSc.nextInt();

            if (x > 0 && y > 0) System.out.println(x + " " + y);

            if (x == 0 || y == 0) {

                System.out.println("Some of the values are equal to 0");

                break;

            }

        }

    }

}
