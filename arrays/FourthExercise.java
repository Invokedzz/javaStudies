package arrays;

import java.util.Scanner;

import java.util.Locale;

public class FourthExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.KOREA);

        receiveAllValues();

    }

    public static void receiveAllValues () {

        Scanner initSc = new Scanner (System.in);

        int arrayParameter = initSc.nextInt();

        double [] allValues = new double[arrayParameter];

        for (int y = 0; y < arrayParameter; y ++) {
            allValues[y] = initSc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < arrayParameter; i ++) {
            sum += allValues[i];
        }

        double m = sum / arrayParameter;

        System.out.println("Total: " + m);

        for (int i = 0; i < arrayParameter; i ++) {
            if (m > allValues[i]) {
                System.out.println(allValues[i]);
            }
        }

    }

}
