package src.trainingFunctions.List.TrianglesTest.application;

import src.trainingFunctions.List.TrianglesTest.entities.SquareEntity;

import java.util.Scanner;

import java.util.Locale;

public class SquareApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        double receiveBothValues = receiveSquareValues();

        System.out.println(receiveBothValues);

    }

    public static double receiveSquareValues () {

        SquareEntity valueA, valueB;

        valueA = new SquareEntity();

        valueB = new SquareEntity();

        Scanner initSc = new Scanner (System.in);

        sendText();

        valueA.a = initSc.nextDouble();

        valueB.b = initSc.nextDouble();

        return valueA.a * valueB.b;

    }

    public static void sendText () {

        System.out.println("Insert the measures for a and b");

    }

}
