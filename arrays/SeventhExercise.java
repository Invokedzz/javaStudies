package arrays;

import java.util.Scanner;

import java.util.Locale;

public class SeventhExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        receiveSomeValues();

    }

    public static void receiveSomeValues() {

        Scanner initSc = new Scanner (System.in);

        int receiveSomeValue = initSc.nextInt();

        double [] vector = new double[receiveSomeValue];

        for (int i = 0; i < receiveSomeValue; i++) {

            System.out.println("Enter a number: ");

            vector[i] = initSc.nextDouble();

        }

        double greaterThan = vector[0];

        int greater = 0;

        for (int i = 1; i < receiveSomeValue; i ++) {

            if (vector[i] > greaterThan) {

                greaterThan = vector[i];
                greater = i;

            }

        }

        System.out.println(greaterThan);

        System.out.println(greater);

    }

}
