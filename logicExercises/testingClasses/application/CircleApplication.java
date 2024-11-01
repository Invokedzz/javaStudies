package logicExercises.testingClasses.application;

import logicExercises.testingClasses.entities.CircleEntity;

import java.util.Scanner;

import java.util.Locale;

public class CircleApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        double receivedValue = receiveValues();

        showUserInformation(receivedValue);

    }

    public static double receiveValues () {

        Scanner initSc = new Scanner (System.in);

        CircleEntity x;

        x = new CircleEntity();

        x.r = initSc.nextDouble();

        return x.calcArea();

    }

    public static void showUserInformation (double value) {

        System.out.println(value);

    }

}
