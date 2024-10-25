package src.baldFlakes2;

import java.util.Scanner;

import java.util.Locale;

public class secondTest {

    public static void main (String[] args) {

        sTest(args);

    }

    public static void sTest (String[] args) {

        Locale.setDefault(Locale.CHINESE);

        Scanner init = new Scanner(System.in);

        double randomValue;

        randomValue = init.nextDouble();

        if (randomValue < 0) System.out.println("Negative");

        else System.out.println("Positive");

    }

}
