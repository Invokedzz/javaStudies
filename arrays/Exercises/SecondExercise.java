package arrays.Exercises;

import java.util.Scanner;

import java.util.Locale;

public class SecondExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.KOREA);

        receiveArrayValues();

    }

    public static void receiveArrayValues () {

        Scanner initSc = new Scanner (System.in);

        int receivedValue = initSc.nextInt();

        double [] vector = new double[receivedValue];

        for (int p = 0; p < receivedValue; p ++) {

            System.out.println("Enter the values: ");

            vector[p] = initSc.nextDouble();

        }

        double receivedNumbers = 0.0;

        double showNumbers;

        for (int a = 0; a < receivedValue; a ++) {

            showNumbers = vector[a];

            receivedNumbers += vector[a];

            System.out.println("Total: " + receivedNumbers);

            System.out.printf("Values = %s", showNumbers);

        }

        double m = receivedNumbers / receivedValue;

        System.out.println(m);

    }

}
