package logicExercises.exercises;

import java.util.Scanner;

import java.util.Locale;

public class LoopFunny {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        doALoop();

    }

    private static void doALoop () {

        Scanner initScanner = new Scanner (System.in);

        int sentByUser = initScanner.nextInt();

        int [] reviewElements = new int [10];

        for (int elementCounter = 0; elementCounter <= sentByUser; elementCounter++) {

            reviewElements[elementCounter] += 1;

            System.out.println(reviewElements[elementCounter]);

        }

        for (int reviewElement : reviewElements) {

            System.out.print(reviewElement);

        }

    }

}
