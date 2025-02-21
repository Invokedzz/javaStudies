package content.logicExercises.testingClasses.application;

import content.logicExercises.testingClasses.entities.RectangleEntity;

import java.util.Scanner;

import java.util.Locale;

public class RectangleApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        double getElementResult = calcElements();

        showElements(getElementResult);

    }

    public static double calcElements () {

        Scanner initSc = new Scanner (System.in);

        RectangleEntity defineValues = new RectangleEntity();

        defineValues.defineLength(initSc.nextDouble());

        defineValues.defineWidth(initSc.nextDouble());

        return defineValues.defineArea();

    }

    public static void showElements (double receivedValue) {

        System.out.println(receivedValue);

    }

}
