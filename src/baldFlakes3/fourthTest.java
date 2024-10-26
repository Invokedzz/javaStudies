package src.baldFlakes3;

import java.util.Locale;

import java.util.Scanner;

public class fourthTest {

    public static void main (String[] args) {

        fTest(args);

    }

    public static void fTest (String[] args) {

        Scanner scInit = new Scanner(System.in);

        double paymentValue, minutes;

        System.out.println("Insert the values for minutes");

        paymentValue = 50.0;

        minutes = scInit.nextDouble();

        if (minutes > 100.0) {

            System.out.println("Time to pay taxes");

            paymentValue += (minutes - 100.0) * 2.0;

            System.out.println(paymentValue);

        }

    }

}
