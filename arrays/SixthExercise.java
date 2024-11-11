package arrays;

import java.util.Scanner;

import java.util.Locale;

import arrays.entities.SixthExerciseEntity;

public class SixthExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        receiveAllValues();

    }

    public static void receiveAllValues () {

        SixthExerciseEntity product;

        Scanner initSc = new Scanner (System.in);

        int receiveNumber = initSc.nextInt();

        String [] name = new String[receiveNumber];

        double [] age = new double[receiveNumber];

        double [] height = new double[receiveNumber];

        for (int y = 0; y < receiveNumber; y++) {

            System.out.println("Enter name: ");

            name [y] = initSc.next();

            System.out.println("Enter age: ");

            age [y] = initSc.nextDouble();

            System.out.println("Enter height: ");

            height [y] = initSc.nextDouble();

            product = new SixthExerciseEntity(name[y], age[y], height[y]);

            System.out.println(product);

        }

        double sum = 0.0;

        for (int y = 0; y < receiveNumber; y++) {

            sum += height[y];

        }

        for (int i = 0; i < receiveNumber; i ++) {

            if (age[i] < 16) {
                System.out.println(name[i]);
            }

        }

        double avg = sum / receiveNumber;

        System.out.println(avg);

    }

}
