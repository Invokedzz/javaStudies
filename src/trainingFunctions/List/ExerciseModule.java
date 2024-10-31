package src.trainingFunctions.List;

import java.util.Scanner;

public class ExerciseModule {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);

        int userInput = scInit.nextInt();

        addValues(userInput);

    }

    public static void addValues (int receivedValue) {

        int minusValue = receivedValue - 1;

        int plusValue = minusValue + 2;

        System.out.println(minusValue + " " + plusValue);

    }

}
