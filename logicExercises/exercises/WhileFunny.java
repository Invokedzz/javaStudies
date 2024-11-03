package logicExercises.exercises;

import java.util.Scanner;

import java.util.Locale;

public class WhileFunny {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        friendWhile();

    }

    private static void friendWhile () {

        Scanner initSc = new Scanner (System.in);

        int referencedByUser = initSc.nextInt();

        while (referencedByUser <= 100) {

            referencedByUser += 1;

            System.out.println(referencedByUser);

        }

    }

}
