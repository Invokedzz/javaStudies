package arrays.Exercises;

import java.util.Scanner;

import java.util.Locale;

public class FirstArray {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        Scanner initSc = new Scanner (System.in);

        int randomStartValue = initSc.nextInt();

        double [] vector = new double[randomStartValue];

        for (int a = 0; a < randomStartValue; a++) {

            vector[a] = initSc.nextDouble();

        }

        double sum = 0.0;

        for (int i = 0; i < randomStartValue; i++) {
            sum += vector[i];
        }

        double trueValue = sum / randomStartValue;

        System.out.println(trueValue);

        initSc.close();

    }

}
