package src.baldFlakes3;

import java.util.Scanner;

public class testIf {

    public static void main (String[] args) {

        useFunction(args);

    }

    public static void useFunction (String[] args) {

        boolean result = testI(args);

        if (!result) System.out.println("Fake");

    }

    public static boolean testI (String[] args) {

        Scanner init = new Scanner(System.in);

        int randomValue;

        randomValue = init.nextInt();

        System.out.println("Select an option: (1), (2), (3)");

        if (randomValue == 1) {

            System.out.println("Number 1!");

            init.close();

            return true;

        }

        if (randomValue == 2) {

            System.out.println("Number 2!");

            init.close();

            return true;

        }

        if (randomValue == 3) {

            System.out.println("Number 3!");

            init.close();

            return true;

        }

        init.close();

        return false;

    }

}
