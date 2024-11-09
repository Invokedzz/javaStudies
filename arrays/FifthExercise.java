package arrays;

import java.util.Locale;

import java.util.Scanner;

public class FifthExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        receiveAllArrayValues();

    }

    public static void receiveAllArrayValues () {

        Scanner initSc = new Scanner (System.in);

        int valueAdded = initSc.nextInt();

        double [] vector = new double[valueAdded];

        System.out.println("Enter the value for the iterator: ");

        double m = 0.0;

        double vec = 0.0;

        for (int x = 0; x < valueAdded; x ++) {
            vector[x] = initSc.nextDouble();

            if (vector[x] % 2 == 0) {
                m += vector[x];
                vec = m / valueAdded;
            }

            else System.out.println("No");

        }

        System.out.println(vec);

    }

}
