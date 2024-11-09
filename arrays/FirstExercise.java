package arrays;

import java.util.Scanner;

import java.util.Locale;

public class FirstExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.KOREA);

        receiveArrays();

    }

    public static void receiveArrays () {

        Scanner initSc = new Scanner (System.in);

        int valueReceivedForArray = initSc.nextInt();

        double [] vector = new double[valueReceivedForArray];

        for (int i = 0; i < valueReceivedForArray; i++) {

            System.out.println("Enter a value: ");

            vector[i] = initSc.nextDouble();

        }

        double valuesWeHaveForTheMoment;

        for (int y = 0; y < valueReceivedForArray; y ++) {

            valuesWeHaveForTheMoment = vector[y];

            if (valuesWeHaveForTheMoment < 0) System.out.println("Negative numbers: \n" + valuesWeHaveForTheMoment);

            else System.out.println(valuesWeHaveForTheMoment);

        }

    }

}
