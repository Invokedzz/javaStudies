package logicExercises.exercises;

import java.util.Scanner;

public class TestNumberFour {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        double firstValue = initSc.nextDouble();

        double secondValue = initSc.nextDouble();

        double valuesSentByUser = receiveValues(firstValue, secondValue);

        System.out.println(valuesSentByUser);

    }

    public static double receiveValues (double x, double y) {

        double addedValues = x + y;

        if (addedValues >= 10) addedValues += 5;

        else if (addedValues < 10) addedValues -= 7;

        else System.out.println("Error");

        return addedValues;

    }

}
